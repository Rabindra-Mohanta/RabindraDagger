package alkusi.kudmi.rabindradagger.di

import alkusi.kudmi.rabindradagger.Contrants
import alkusi.kudmi.rabindradagger.network.EndPoints
import android.provider.SyncStateContract.Constants
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class RetrofitModule {
    @Singleton
    @Provides
    fun getRetrofitInstance():Retrofit
    {
        return Retrofit.Builder().baseUrl(Contrants.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build()
    }
    @Singleton
    @Provides
   fun getApiEndPoint(retrofit: Retrofit):EndPoints
    {
        return retrofit.create(EndPoints::class.java)
    }
}