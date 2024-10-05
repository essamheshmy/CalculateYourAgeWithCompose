package com.heshmy.calculateyouragewithcompose.dada.repository

import com.heshmy.calculateyouragewithcompose.dada.model.Person
import java.util.Calendar

class CalculateAgeRepositoryImpl:CalculateAgeRepository {
        override fun calculateYourAge(name: String, age: Int): Person {
            val currentYear = Calendar.getInstance().get(Calendar.YEAR)
            val yourAge= currentYear - age
            val person= Person(name, yourAge)
            return person
        }


}

