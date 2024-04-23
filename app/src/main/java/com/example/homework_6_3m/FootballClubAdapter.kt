package com.example.homework_6_3m

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework_6_3m.databinding.ItemFootballClubBinding

class FootballClubAdapter(private val list: ArrayList<FootballClub>):
    RecyclerView.Adapter<FootballClubAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemFootballClubBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ViewHolder(private val binding: ItemFootballClubBinding):
            RecyclerView.ViewHolder(binding.root) {
                fun bind(footballClub: FootballClub) {
                    binding.imgFootballClub.loadImage(footballClub.image)
                    binding.tvFootballClub.text = footballClub.name
                }
            }
}
