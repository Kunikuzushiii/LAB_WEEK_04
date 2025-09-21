package com.example.lab_week_04

import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
private val CAFE_TABS = listOf(
    R.string.starbucks_title to R.string.starbucks_desc,
    R.string.janjijiwa_title to R.string.janjijiwa_desc,
    R.string.kopikenangan_title to R.string.kopikenangan_desc
)

class CafeAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle)
    : FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount() = CAFE_TABS.size

    override fun createFragment(position: Int): Fragment {
        val (titleRes, descRes) = CAFE_TABS[position]
        return CafeDetailFragment.newInstance(titleRes, descRes)
    }

    @StringRes
    fun getTabTitle(position: Int): Int = CAFE_TABS[position].first
}
