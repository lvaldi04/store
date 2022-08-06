package com.codecademy.store

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.codecademy.store.adapter.ItemAdapter
import com.codecademy.store.data.DataSources

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDataset = DataSources().loadStoreMainList()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view_main)
        recyclerView.adapter = ItemAdapter(myDataset, this)
        recyclerView.setHasFixedSize(true)
    }
}