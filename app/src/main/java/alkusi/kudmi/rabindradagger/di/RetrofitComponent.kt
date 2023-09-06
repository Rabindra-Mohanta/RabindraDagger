package alkusi.kudmi.rabindradagger.di
import alkusi.kudmi.rabindradagger.MainActivity
import android.content.Context
import androidx.lifecycle.ViewModel
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton
@Singleton
@Component(modules = [RetrofitModule::class,RoomModule::class,ViewModelModule::class])
interface  RetrofitComponent {
    fun initComponent(mainActivity: MainActivity);
    fun getViewModelMap():Map<Class<*>, ViewModel>
    @Component.Factory
    interface Factory
    {
        fun create(@BindsInstance context: Context):RetrofitComponent
    }
}