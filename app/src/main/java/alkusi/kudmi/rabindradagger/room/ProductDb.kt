package alkusi.kudmi.rabindradagger.room

import alkusi.kudmi.rabindradagger.model.Product
import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Product::class], version = 1)
abstract class ProductDb:RoomDatabase() {
    abstract fun getDao():ProductDao
}