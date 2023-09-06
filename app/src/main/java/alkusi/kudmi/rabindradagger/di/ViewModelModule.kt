package alkusi.kudmi.rabindradagger.di

import alkusi.kudmi.rabindradagger.viewmodel.MainViewModel
import alkusi.kudmi.rabindradagger.viewmodel.MainViewModel2
import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey

@Module
abstract class ViewModelModule {
 @Binds
 //@StringKey("getMainViewModel")
 @ClassKey(MainViewModel::class)
 @IntoMap
 abstract fun getMainViewModel(mainViewModel: MainViewModel): ViewModel

 @Binds
 //@StringKey("getMainViewModel2")
 @ClassKey(MainViewModel2::class)
 @IntoMap
 abstract fun getMainViewModel2(mainViewModel2: MainViewModel2):ViewModel
}