package com.example.meteopasla

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.meteopasla.Room.Entity.VilleEntity

class VilleListAdapter internal constructor(
    context: Context
) : RecyclerView.Adapter<VilleListAdapter.VilleViewHolder>() {

    private val inflater: LayoutInflater = LayoutInflater.from(context)
    private var villes = emptyList<VilleEntity>() // Cached copy of words

    inner class VilleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val wordItemView: TextView = itemView.findViewById(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VilleViewHolder {
        val itemView = inflater.inflate(R.layout.recyclerview_item, parent, false)
        return VilleViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: VilleViewHolder, position: Int) {
        val current = villes[position]
        holder.wordItemView.text = current.ville
    }

    internal fun setVille(viles: List<VilleEntity>) {
        this.villes = viles
        notifyDataSetChanged()
    }

    override fun getItemCount() = villes.size
}