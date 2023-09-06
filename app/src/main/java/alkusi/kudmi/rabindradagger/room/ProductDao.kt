package alkusi.kudmi.rabindradagger.room

import alkusi.kudmi.rabindradagger.model.Product
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface ProductDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertProduct(product:List<Product>)
    @Query("SELECT * FROM Product")
    suspend fun getProductFromDb():List<Product>
}