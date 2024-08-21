package com.heshmy.calculateyouragewithcompose.dada.local

import androidx.lifecycle.MutableLiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.heshmy.calculateyouragewithcompose.dada.model.Person

@Dao
interface PersonDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addPerson(  person: Person)
    @Query("SELECT * FROM person_table")
    suspend  fun getAll(): MutableLiveData<Person>
    @Query("SELECT * FROM person_table WHERE person_name = :name")
    suspend fun getPerson(name:String): Person
    @Insert
    suspend fun insertAll(vararg person:Person)
    @Delete
    suspend   fun delete(person: Person)
    @Query("Delete  FROM person_table ")
    suspend  fun deleteall()

}