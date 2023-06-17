package com.lederboard.app.tabadapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.lederboard.app.DummyData
import com.lederboard.app.ui.UsersLeaderboardFragment

class LeaderboardPagerAdapter(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount() = ITEMS_COUNT

    override fun createFragment(position: Int) = when (position) {
        0 -> UsersLeaderboardFragment.newInstance(ArrayList(DummyData.regionUsers))
        1 -> UsersLeaderboardFragment.newInstance(ArrayList(DummyData.nationalUsers))
        else -> UsersLeaderboardFragment.newInstance(ArrayList(DummyData.globalUsers))
    }


    companion object {
        private const val ITEMS_COUNT = 3
    }
}