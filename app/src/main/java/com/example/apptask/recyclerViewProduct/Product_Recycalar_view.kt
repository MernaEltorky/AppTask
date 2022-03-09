package com.example.apptask.recyclerViewProduct

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.apptask.R
import kotlinx.android.synthetic.main.activity_product__recycalar_view.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val BASE_URL = "https://android-training.appssquare.com/api/products/"
class Product_Recycalar_view : AppCompatActivity() {
    lateinit var productAdapter: ProductAdapter
    lateinit var linearLayoutManager: LinearLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product__recycalar_view)

        product_rc.setHasFixedSize(true)
        linearLayoutManager = LinearLayoutManager(this)
        product_rc.layoutManager = linearLayoutManager
        val product = ArrayList<Product>()



        val retrofitBuilder = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ProductApi::class.java)


        val retrofitData = retrofitBuilder.getProduct()
        retrofitData?.enqueue(object : Callback<Product?> {
            override fun onResponse(call: Call<Product?>, response: Response <Product?>) {

                val  responseBody = response.body()!!

                productAdapter = ProductAdapter(baseContext,responseBody)
                productAdapter.notifyDataSetChanged()
                product_rc.adapter = productAdapter


            }

            override fun onFailure(call: Call<Product?>, t: Throwable) {
                Log.d("Product_Recycalar_view","on Failure"+ t.message)

            }
        })


    }
}



