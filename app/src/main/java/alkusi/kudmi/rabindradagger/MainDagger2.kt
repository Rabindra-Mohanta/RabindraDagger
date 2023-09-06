package alkusi.kudmi.rabindradagger
import alkusi.kudmi.rabindradagger.di.DaggerRetrofitComponent
import alkusi.kudmi.rabindradagger.di.RetrofitComponent
import android.app.Application
import dagger.internal.DaggerGenerated
class MainDagger2: Application() {
    lateinit var retrofitComponent: RetrofitComponent;
    override fun onCreate() {
        super.onCreate()
        retrofitComponent = DaggerRetrofitComponent.factory().create(this)
    }
}