package com.heshmy.calculateyouragewithcompose.dada.repository

import com.heshmy.calculateyouragewithcompose.dada.model.Person

interface CalculateAgeRepository {
    fun calculateYourAge(name: String, age: Int): Person

}