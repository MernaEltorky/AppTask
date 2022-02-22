package com.example.apptask.tablayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
@Suppress("DEPRECATION")

internal  class PagerAdapter(var context: FragmentManager, fm: TabLayoutActivity, var totalTabs: Int) :FragmentPagerAdapter(fm)  {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                FragmentOne()
            }
            1 -> {
               FragmentTwo()
            }
            2 -> {
                FragmentThree()
            }
            else -> getItem(position)
        }
    }

    override fun getCount(): Int {
        return totalTabs
    }

}