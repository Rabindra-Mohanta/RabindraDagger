package alkusi.kudmi.rabindradagger.viewmodel

import alkusi.kudmi.rabindradagger.model.Product
import alkusi.kudmi.rabindradagger.network.EndPoints
import alkusi.kudmi.rabindradagger.network.NetworkRepository
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(val networkRepository: NetworkRepository,val randomize: Randomize): ViewModel() {
    val data:LiveData<List<Product>>
    get() = networkRepository.mutableProducts

    init {
        viewModelScope.launch {
            networkRepository.getProductData()
        } }
    }

class Randomize @Inject constructor()
{
    fun doAction()
    {
        Log.d("Rabindra","Random Action")
    }
}

