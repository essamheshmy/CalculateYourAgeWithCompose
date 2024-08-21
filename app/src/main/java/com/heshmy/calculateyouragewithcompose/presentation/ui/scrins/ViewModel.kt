package com.heshmy.calculateyouragewithcompose.presentation.ui.scrins

import androidx.lifecycle.ViewModel
import com.heshmy.calculateyouragewithcompose.dada.model.Person
import com.heshmy.calculateyouragewithcompose.dada.repository.CalculateAgeRepository
import com.heshmy.calculateyouragewithcompose.dada.repository.CalculateAgeRepositoryImpl

class PersonViewModel: ViewModel() {

    val calculateAgeRepository: CalculateAgeRepository = CalculateAgeRepositoryImpl()
    fun calculiteAge(name:String, age:Int): Person {
        val personMutableLiveData=calculateAgeRepository.calculateYourAge(name,age)
        return personMutableLiveData
    }
}