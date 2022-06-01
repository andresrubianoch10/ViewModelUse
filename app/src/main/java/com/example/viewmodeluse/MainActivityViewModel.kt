package com.example.viewmodeluse

import androidx.lifecycle.ViewModel

class MainActivityViewModel(
    private val startingPoint: Int
) : ViewModel() {

    private var count = startingPoint

    fun getCurrentCount(): Int {
        return count
    }

    fun getUpdatedCount(): Int {
        return ++count
    }
}