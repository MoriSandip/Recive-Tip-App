package com.example.recivetipapp.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recivetipapp.Activity.Adapter.CustomAdapter
import com.example.recivetipapp.Activity.Adapter.CustomAdapterToday
import com.example.recivetipapp.Activity.Model.ItemsViewModel
import com.example.recivetipapp.Activity.Model.ItemsViewModelToday
import com.example.recivetipapp.R
import kotlinx.android.synthetic.main.activity_dashboard_screen.*

class DashboardScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard_screen)

        recyclerView2.layoutManager = LinearLayoutManager(this)
        recyclerView2.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL ,false)
        val data = ArrayList<ItemsViewModel>()
        for (i in 1..20) {
            data.add(ItemsViewModel(R.drawable.ic_mc, "Item " + i))
        }
        val adapter = CustomAdapter(data)
        recyclerView2.adapter = adapter



        recyclerView.layoutManager = LinearLayoutManager(this)
        val datatoday = ArrayList<ItemsViewModelToday>()
        for (i in 1..20) {
            datatoday.add(ItemsViewModelToday(R.drawable.ic_mc, "Item " + i))
        }
        val adapterToday = CustomAdapterToday(data)
        recyclerView.adapter = adapterToday
    }
}