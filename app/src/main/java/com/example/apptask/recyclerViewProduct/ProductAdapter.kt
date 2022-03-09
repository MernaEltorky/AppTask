package com.example.apptask.recyclerViewProduct

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.apptask.R
import kotlinx.android.synthetic.main.item_product.view.*


class ProductAdapter(val context: Context, val productList: List <Product>) :
    RecyclerView.Adapter<ProductAdapter.ProductViewHolder> () {

    class ProductViewHolder(itemView:View ) : RecyclerView .ViewHolder(itemView) {
        var name:TextView
        var price:TextView
        var quantity:TextView

        init {

            name = itemView.name
            price = itemView .price
            quantity =itemView.quantity
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {

        var itemView = LayoutInflater.from(context).inflate(R.layout.item_product,parent,false)
        return ProductViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {

        holder.name.text= this.productList[position].name
        holder.price.text=productList[position].price.toString()
        holder.quantity.text= productList[position].quantity.toString()


    }

    override fun getItemCount(): Int {

        return productList.size
    }


}