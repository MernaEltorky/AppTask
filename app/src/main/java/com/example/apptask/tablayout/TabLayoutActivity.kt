package com.example.apptask.tablayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.apptask.R
import com.google.android.material.tabs.TabLayout


class TabLayoutActivity : AppCompatActivity() {

    lateinit var tabLayout: TabLayout
    lateinit var viewPager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab_layout)

         viewPager = findViewById(R.id.View_Pager)
         tabLayout = findViewById(R.id.tab_layout)

        tabLayout.addTab(tabLayout.newTab().setText("Less than 50 "))
        tabLayout.addTab(tabLayout.newTab().setText("between 5 & 100"))
        tabLayout.addTab(tabLayout.newTab().setText("greater than 100"))
        tabLayout.tabGravity = TabLayout.GRAVITY_FILL

        val adapter =PagerAdapter(supportFragmentManager, this, tabLayout.tabCount)
        viewPager.adapter = adapter
        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                viewPager.currentItem = tab.position
            }
            override fun onTabUnselected(tab: TabLayout.Tab) {}
            override fun onTabReselected(tab: TabLayout.Tab) {}
        })
    }


    }

