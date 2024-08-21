package com.heshmy.calculateyouragewithcompose.dada.repository

import androidx.lifecycle.MutableLiveData
import com.heshmy.calculateyouragewithcompose.dada.model.Person

interface LocalRepository {

    suspend fun addPerson(person: Person)
    suspend fun getAllPerson(): MutableLiveData<Person>
    suspend fun getItemStream(name: String): Person
    suspend fun insertPerson(person: Person)
    suspend fun deletePerson(person: Person)
    suspend fun deleteAll()
    suspend fun updatePerson(person: Person)
}