package alkusi.kudmi.rabindradagger.network

import alkusi.kudmi.rabindradagger.model.Product
import alkusi.kudmi.rabindradagger.room.ProductDb
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import javax.inject.Inject

class NetworkRepository @Inject constructor(val endPoints: EndPoints, val productDb: ProductDb) {
    val mutableProducts = MutableLiveData<List<Product>>();
    val productLive:LiveData<List<Product>>
    get () = mutableProducts

    suspend fun getProductData()
    {
        val result =endPoints.getProducts()
        if(result.isSuccessful)
        {
            mutableProducts.postValue(result.body())
            productDb.getDao().insertProduct(result.body()!!)
        }
    }
}