package com.heshmy.calculateyouragewithcompose.dada.repository

import androidx.lifecycle.MutableLiveData
import com.heshmy.calculateyouragewithcompose.dada.local.PersonDao
import com.heshmy.calculateyouragewithcompose.dada.model.Person


class LocalRepositoryImpl(private val personDao: PersonDao): LocalRepository {

    override suspend fun addPerson(person: Person) { personDao.addPerson(person) }
    override suspend fun getAllPerson(): MutableLiveData<Person> = personDao.getAll()
    override suspend fun getItemStream(name: String): Person =personDao.getPerson(name)
    override suspend fun insertPerson(person: Person) =personDao.addPerson(person)
    override suspend fun deletePerson(person: Person) {personDao.delete(person)}
    override suspend fun deleteAll() {personDao.deleteall()}
    override suspend fun updatePerson(person: Person) {personDao.deleteall()}
}