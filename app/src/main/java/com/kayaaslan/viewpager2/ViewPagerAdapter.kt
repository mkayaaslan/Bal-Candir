package com.kayaaslan.viewpager2

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.kayaaslan.viewpager2.Fragments.FirstFragment
import com.kayaaslan.viewpager2.Fragments.SecondFragment

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    val fragments:ArrayList<Fragment> = arrayListOf(
        FirstFragment(),
        SecondFragment()


    )

    override fun getItemCount(): Int {

        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }


}
