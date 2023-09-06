package alkusi.kudmi.rabindradagger.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject

class MainViewModel2 @Inject constructor(val randomize: Randomize): ViewModel() {
    init {
        randomize.doAction()
    }
}