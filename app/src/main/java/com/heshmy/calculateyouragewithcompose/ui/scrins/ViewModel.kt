package com.heshmy.calculateyouragewithcompose.presentation.ui.scrins

import android.content.Context
import androidx.lifecycle.ViewModel
//import com.heshmy.calculateyouragewithcompose.CalculateApplication
//import com.heshmy.calculateyouragewithcompose.dada.local.PersonDao
//import com.heshmy.calculateyouragewithcompose.dada.local.PersonDatabase
import com.heshmy.calculateyouragewithcompose.dada.model.Person
import com.heshmy.calculateyouragewithcompose.dada.repository.CalculateAgeRepository
import com.heshmy.calculateyouragewithcompose.dada.repository.CalculateAgeRepositoryImpl
//import com.heshmy.calculateyouragewithcompose.dada.repository.LocalRepository
//import com.heshmy.calculateyouragewithcompose.dada.repository.LocalRepositoryImpl

class PersonViewModel(context: Context): ViewModel() {

    val calculateAgeRepository: CalculateAgeRepository = CalculateAgeRepositoryImpl()
    fun calculiteAge(name:String, age:Int): Person {
        val personMutableLiveData=calculateAgeRepository.calculateYourAge(name,age)
        return personMutableLiveData
    }


   // private var personDatabase:PersonDao = PersonDatabase.getDaoInstance(context)

   // val localRepository: LocalRepository = LocalRepositoryImpl(personDatabase)

    //suspend fun addPerson(person: Person) { localRepository.addPerson(person = person) }

}

