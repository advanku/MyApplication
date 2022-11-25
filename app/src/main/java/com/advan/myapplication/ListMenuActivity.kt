package com.advan.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.advan.myapplication.databinding.ActivityListMenuBinding

class ListMenuActivity : AppCompatActivity() {
    private lateinit var binding: ActivityListMenuBinding
    private lateinit var mAdapter: ListMenuAdapter
    private var listFood = arrayListOf<Food>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        listFood = ObjectListFood.listMenu
        mAdapter = ListMenuAdapter()
        mAdapter.submitList(listFood)
        binding.rvMenu.adapter = mAdapter
//      binding.rvMenu.layoutManager = LinearLayoutManager(this@ListMenuActivity)
        //untuk tampilan kesamping (horizontal)
        binding.rvMenu.layoutManager = LinearLayoutManager(this@ListMenuActivity, LinearLayoutManager.HORIZONTAL, false)
        binding.rvMenu.setHasFixedSize(true)
    }
}