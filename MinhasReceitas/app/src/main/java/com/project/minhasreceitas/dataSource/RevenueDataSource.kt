package com.project.minhasreceitas.dataSource

import com.project.minhasreceitas.model.Revenue

object RevenueDataSource {
    private val list = arrayListOf<Revenue>()

    fun getList() = list.toList()

    fun insertRevenue(revenue : Revenue) {
        if (revenue.id == 0){
            list.add(revenue.copy(id = list.size + 1))
        } else {
            list.remove(revenue)
            list.add(revenue)
        }

    }

    fun findById(revenueId: Int) = list.find { it.id == revenueId }

    fun deleteRevenue(revenue : Revenue) {
        list.remove(revenue)
    }
}