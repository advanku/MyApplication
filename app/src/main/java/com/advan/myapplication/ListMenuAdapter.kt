package com.advan.myapplication

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.advan.myapplication.databinding.ItemMenuBinding
import com.bumptech.glide.Glide

class ListMenuAdapter : ListAdapter<Food, ListMenuAdapter.ViewHolder>(DIFF_CALLBACK) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemMenuBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }


    inner class ViewHolder(
        private val binding: ItemMenuBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(food: Food) {
            binding.apply {
                tvMenuName.text = food.name
                tvMenuDescription.text = food.descritiption
                tvMenuPrice.text = food.price.toString()
                Glide.with(itemView.context)
                    .load(food.image)
                    .into(imgMenu)
            }
        }
    }

    companion object{
        val DIFF_CALLBACK: DiffUtil.ItemCallback<Food> = object : DiffUtil.ItemCallback<Food>(){
            override fun areItemsTheSame(oldItem: Food, newItem: Food): Boolean {
                return oldItem.name == newItem.name
            }

            @SuppressLint("DiffUtilEquals")
            override fun areContentsTheSame(oldItem: Food, newItem: Food): Boolean {
                return oldItem == newItem
            }
        }
    }
}