package alkusi.kudmi.rabindradagger.di

import alkusi.kudmi.rabindradagger.room.ProductDb
import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RoomModule {
    @Singleton
    @Provides
    fun getDatabase(context: Context):ProductDb
    {
        return Room.databaseBuilder(context,ProductDb::class.java,"Rabigg").build()
    }
}