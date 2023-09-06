package alkusi.kudmi.rabindradagger.network

import alkusi.kudmi.rabindradagger.model.Product
import retrofit2.Response
import retrofit2.http.GET

interface EndPoints {
    @GET("/products")
    suspend fun getProducts():Response<List<Product>>;
}