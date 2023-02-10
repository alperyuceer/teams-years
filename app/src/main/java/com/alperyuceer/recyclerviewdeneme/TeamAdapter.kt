package com.alperyuceer.recyclerviewdeneme

import android.content.Intent
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alperyuceer.recyclerviewdeneme.databinding.RecyclerviewRowBinding

class TeamAdapter(val teamList: ArrayList<Team>):RecyclerView.Adapter<TeamAdapter.TeamHolder>() {

    class TeamHolder(val binding: RecyclerviewRowBinding):RecyclerView.ViewHolder(binding.root){
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamHolder {
        val binding = RecyclerviewRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return  TeamHolder(binding)

    }

    override fun getItemCount(): Int {
        return teamList.size
    }

    override fun onBindViewHolder(holder: TeamHolder, position: Int) {
        holder.binding.teamNameText.text = teamList.get(position).teamName
        if (position%2 == 0){
            holder.binding.teamNameText.setBackgroundColor(Color.parseColor("#4cdc04"))
            holder.binding.teamNameText.setTextColor(Color.parseColor("#825736"))
        } else{
            holder.binding.teamNameText.setBackgroundColor(Color.parseColor("#825736"))
            holder.binding.teamNameText.setTextColor(Color.parseColor("#4cdc04"))

        }
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,DetailsActivity::class.java)
            intent.putExtra("teams",teamList.get(position))
            holder.itemView.context.startActivity(intent)
        }
    }
}