package com.example.apptask.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.apptask.R


class OrderAapter( val orderList: ArrayList<OrderData>) : RecyclerView.Adapter<OrderAapter.OrderViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrderViewHolder {
        var view:View=LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return OrderViewHolder(view)
    }

    override fun getItemCount(): Int {
        return orderList.size
    }

    override fun onBindViewHolder(holder: OrderViewHolder, position: Int) {
        var orderData: OrderData =orderList.get(position)
        holder.description.text=orderData.orderDescription
        holder.date.text=orderData.date
    }


    class OrderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var description:TextView= itemView.findViewById(R.id.item_order_tv_description)
        var date:TextView= itemView.findViewById(R.id.item_order_tv_date)



    }



}