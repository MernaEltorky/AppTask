package com.example.apptask.tablayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.apptask.R
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class TabLayoutActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab_layout)

        val tabLayout = findViewById<TabLayout>(R.id.tab_layout)
        val viewPager2 = findViewById<ViewPager2>(R.id.View_Pager2)

        val adapter=PagerAdapter(supportFragmentManager,lifecycle)
        viewPager2.adapter=adapter


        TabLayoutMediator(tabLayout,viewPager2){tab,position->

            when (position){

                0 -> {
                    tab.text="first"
                }
                1 -> {
                    tab.text="second"
                }
                2 -> {
                    tab.text="third"
                }
            }
        } .attach()

    }

}

