package com.codecademy.store.data

import com.codecademy.store.R
import com.codecademy.store.models.storeMainList

class DataSources {

    public fun loadStoreMainList() : List<storeMainList>{
        return listOf<storeMainList>(
            storeMainList(R.string.test1),
            storeMainList(R.string.test2),
            storeMainList(R.string.test3)
        )

    }
}