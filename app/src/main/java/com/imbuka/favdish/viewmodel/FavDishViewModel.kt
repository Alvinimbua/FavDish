package com.imbuka.favdish.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.imbuka.favdish.model.database.FavDishRepository
import com.imbuka.favdish.model.entities.FavDish
import kotlinx.coroutines.launch

//pass the repository in the view model
//role of view model is to provide data to the UI and survivve configuration changes.
//it acts as communication center between the repository and the UI
//and it can also be used to share data between fragments
class FavDishViewModel(private val repository: FavDishRepository) : ViewModel() {

    fun insert(dish: FavDish) = viewModelScope.launch {
        repository.insertFavDishData(dish)
    }
}

class FavDishViewModelFactory(private val repository: FavDishRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(FavDishViewModel::class.java)){
            @Suppress("UNCHECKED_CAST")
            return FavDishViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}