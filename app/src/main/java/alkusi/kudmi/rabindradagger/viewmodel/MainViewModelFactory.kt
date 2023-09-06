package alkusi.kudmi.rabindradagger.viewmodel

import alkusi.kudmi.rabindradagger.network.NetworkRepository
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject

class MainViewModelFactory @Inject constructor(val map:Map<Class<*>,@JvmSuppressWildcards ViewModel>):ViewModelProvider.Factory
{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return map[modelClass] as T
    }
}