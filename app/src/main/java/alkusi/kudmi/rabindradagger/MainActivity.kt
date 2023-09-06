package alkusi.kudmi.rabindradagger

import alkusi.kudmi.rabindradagger.databinding.ActivityMainBinding
import alkusi.kudmi.rabindradagger.network.NetworkRepository
import alkusi.kudmi.rabindradagger.viewmodel.MainViewModel
import alkusi.kudmi.rabindradagger.viewmodel.MainViewModelFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding;
    lateinit var mainViewModel: MainViewModel;
    @Inject
    lateinit var viewModelFactory: MainViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        (application as MainDagger2).retrofitComponent.initComponent(this)
        (application as MainDagger2).retrofitComponent.getViewModelMap()
        mainViewModel = ViewModelProvider(this,viewModelFactory).get(MainViewModel::class.java);

        mainViewModel.data.observe(this, Observer {
            binding.txtName.text = it.joinToString { c->c.description+"\n\n" }
        })

    }
}