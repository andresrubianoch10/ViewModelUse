package com.example.viewmodeluse

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    private var _count = MutableLiveData<Int>()
    internal val count: LiveData<Int>
        get() = _count

    init {
        _count.value = 0
    }

    fun getUpdatedCount() {
        _count.value = _count.value?.plus(1)
    }
}