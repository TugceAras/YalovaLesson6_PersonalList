package com.tugcearas.personallistapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tugcearas.personallistapp.databinding.ListItemBinding

class PersonalListAdapter(private val list: List<PersonalListDataModel>): RecyclerView.Adapter<PersonalListAdapter.MyListViewHolder>() {

    inner class MyListViewHolder(private val binding: ListItemBinding):RecyclerView.ViewHolder(binding.root){

        fun bind(getList: PersonalListDataModel){
            binding.tvName.text = getList.name
            binding.tvSurname.text = getList.surname
            binding.tvCity.text = getList.city
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonalListAdapter.MyListViewHolder {
        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MyListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PersonalListAdapter.MyListViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size
}