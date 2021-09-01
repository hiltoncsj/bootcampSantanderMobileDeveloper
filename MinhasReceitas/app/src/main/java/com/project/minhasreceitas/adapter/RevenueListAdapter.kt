package com.project.minhasreceitas.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.PopupMenu
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.project.minhasreceitas.R
import com.project.minhasreceitas.databinding.ItemRevenueBinding
import com.project.minhasreceitas.model.Revenue

class RevenueListAdapter : androidx.recyclerview.widget.ListAdapter<Revenue, RevenueListAdapter.MyViewHolder>(DiffCallback()) {

    var listenerEdit : (Revenue) -> Unit = {}
    var listenerDelete : (Revenue) -> Unit = {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemRevenueBinding.inflate(inflater, parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class MyViewHolder(
        private val binding: ItemRevenueBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Revenue) {
            binding.tvTitle.text = item.title
            binding.tvDate.text = "${item.date} ${item.time}"
            binding.imMore.setOnClickListener {
                showPopup(item)
            }
        }

        private fun showPopup(item: Revenue) {
            val ivMore = binding.imMore
            val popupMenu = PopupMenu(ivMore.context, ivMore)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener {
                when (it.itemId) {
                    R.id.action_edit -> listenerEdit(item)
                    R.id.action_delete -> listenerDelete(item)
                }
                return@setOnMenuItemClickListener true
            }
            popupMenu.show()
        }

    }

}

class DiffCallback : DiffUtil.ItemCallback<Revenue>() {
    override fun areItemsTheSame(oldItem: Revenue, newItem: Revenue) = oldItem == newItem
    override fun areContentsTheSame(oldItem: Revenue, newItem: Revenue) = oldItem.id == newItem.id
}
