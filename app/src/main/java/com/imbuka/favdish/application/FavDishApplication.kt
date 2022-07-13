package com.imbuka.favdish.application

import android.app.Application
import com.imbuka.favdish.model.database.FavDishRepository
import com.imbuka.favdish.model.database.FavDishRoomDatabase

class FavDishApplication : Application( ) {

    //lazy keyword is used for creating a new instance that uses the specified initialization
    //function and the default thread safety mode which is called LazyThreadSafetyMode.SYNCRONISED
    private val database by lazy { FavDishRoomDatabase.getDatabase((this@FavDishApplication)) }

    val repository by lazy { FavDishRepository(database.favDishDao()) }
}