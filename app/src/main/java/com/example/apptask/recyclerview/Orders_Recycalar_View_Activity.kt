package com.example.apptask.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.apptask.R

class Orders_Recycalar_View_Activity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_orders__recycalar__view_)
        val recyclerview = findViewById<RecyclerView>(R.id.main_rv_orders)
        val orders = ArrayList<OrderData>()
        orders.add(
            OrderData(
                "mmmmmmm",
                "21/3/2021"
            )
        )
        orders.add(
            OrderData(
                "mmmmmmm",
                "21/4/2021"
            )
        )
        orders.add(
            OrderData(
                "mmmmmmm",
                "21/5/2021"
            )
        )
        orders.add(
            OrderData(
                "mmmmmmm",
                "21/6/2021"
            )
        )
        orders.add(
            OrderData(
                "mmmmmmm",
                "21/7/2021"
            )
        )
        orders.add(
            OrderData(
                "mmmmmmm",
                "21/8/2021"
            )
        )
        orders.add(
            OrderData(
                "mmjjjjmmm",
                "21/9/2021"
            )
        )
        orders.add(
            OrderData(
                "kkkkkkm",
                "21/10/2021"
            )
        )
        orders.add(
            OrderData(
                "hhhhhh",
                "21/11/2021"
            )
        )
        orders.add(
            OrderData(
                "nnnnnnn",
                "21/12/2021"
            )
        )


        recyclerview.layoutManager = LinearLayoutManager(this)
        val aapter= OrderAapter(orders)
        recyclerview.adapter=aapter



    }
}