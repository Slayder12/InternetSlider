package com.example.internetslider.utils

import  androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.internetslider.fragments.ViewPageFragment
import com.example.internetslider.models.Page


class ViewPageAdapter(
    fragment: FragmentActivity,
    private val viewPageList: MutableList<Page>
) :
    FragmentStateAdapter(fragment) {

    override fun getItemCount() = viewPageList.size

    override fun createFragment(position: Int): Fragment {
        val fragment = ViewPageFragment()
        fragment.arguments = bundleOf("page" to viewPageList[position])
        return fragment
    }
}