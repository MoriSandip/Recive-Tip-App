package com.example.recivetipapp.Activity.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recivetipapp.Activity.Model.ItemsViewModel
import com.example.recivetipapp.R

class CustomAdapterToday(private val mList:List<ItemsViewModel>):RecyclerView.Adapter<CustomAdapterToday.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.today_tansaction_sample, parent, false)
        return ViewHolder(view)
    }



    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemsViewModel = mList[position]

        holder.itemimg.setImageResource(itemsViewModel.image)

        holder.item_title.text = itemsViewModel.text
    }



    override fun getItemCount(): Int {
        return mList.size
    }


    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val itemimg: ImageView = itemView.findViewById(R.id.todayitem_img)
        val item_title: TextView = itemView.findViewById(R.id.today_item_title)


    }
     
}
