package com.example.internetslider

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.internetslider.models.Page
import com.example.internetslider.utils.ViewPageAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private val pageList = Page.pageList
    private lateinit var viewPager: ViewPager2
    private lateinit var adapter: ViewPageAdapter
    private lateinit var tabLayout: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = ViewPageAdapter(this, pageList)
        tabLayout = findViewById(R.id.tabLayout)
        viewPager = findViewById(R.id.viewPager)

        viewPager.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            val title = pageList[position].title
            tab.text = title
            //tab.setIcon(pageList[position].image)
//            if (position == 3){
//                val badge = tab.orCreateBadge
//                badge.number = 1
//            }

        }.attach()

    }
}