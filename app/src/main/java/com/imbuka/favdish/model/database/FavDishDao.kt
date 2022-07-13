package com.imbuka.favdish.model.database

import androidx.room.Dao
import androidx.room.Insert
import com.imbuka.favdish.model.entities.FavDish

@Dao
interface FavDishDao {
//methods that will be used through out the application
//suspend similar to async from other programming languages.
    @Insert
     suspend fun insertFavDishDetails(favDish: FavDish)


}