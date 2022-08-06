package com.codecademy.store.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.codecademy.store.R
import com.codecademy.store.models.storeMainList
import org.w3c.dom.Text

class ItemAdapter(private val dataset : List<storeMainList>,
                  private val context : Context) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

     class ItemViewHolder(private val view : View) : RecyclerView.ViewHolder(view){
         val textView : TextView = view.findViewById(R.id.item_title)
     }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
    }

    override fun getItemCount():Int{

        return dataset.size
    }
}