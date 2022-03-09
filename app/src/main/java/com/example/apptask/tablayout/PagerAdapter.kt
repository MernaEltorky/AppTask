package com.example.apptask.tablayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.apptask.fragment.FragmentOne
import com.example.apptask.fragment.FragmentThree
import com.example.apptask.fragment.FragmentTwo


class PagerAdapter(fragmentManager: FragmentManager,lifecycle: Lifecycle):FragmentStateAdapter(fragmentManager, lifecycle) {
         override fun getItemCount(): Int {
             return 3

         }

         override fun createFragment(position: Int): Fragment {

            return when(position){

                 0 -> {
                     FragmentOne()
                 }
                 1 -> {
                     FragmentTwo()
                 }
                 2 -> {
                     FragmentThree()
                 }

                 else->{
                     Fragment()
                 }



             }
         }


     }