package com.imbuka.favdish.model.database

import androidx.annotation.WorkerThread
import com.imbuka.favdish.model.entities.FavDish

class FavDishRepository ( private val  favDishDao: FavDishDao) {

    @WorkerThread
    suspend fun insertFavDishData(favDish: FavDish){
         favDishDao.insertFavDishDetails(favDish)
    }
}