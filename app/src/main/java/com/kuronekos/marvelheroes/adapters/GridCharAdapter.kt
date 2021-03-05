package com.kuronekos.marvelheroes.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.kuronekos.marvelheroes.Character
import com.kuronekos.marvelheroes.DetailActivity
import com.kuronekos.marvelheroes.R

class GridCharAdapter(private val listchar: ArrayList<Character>) :
    RecyclerView.Adapter<GridCharAdapter.GridViewHolder>() {
    inner class GridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgPhoto: ImageView = itemView.findViewById(R.id.img_char_photo)
        val tvName: TextView = itemView.findViewById(R.id.tv_item_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_grid_marvel, parent, false)
        return GridViewHolder(view)
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        val character = listchar[position]
        Glide.with(holder.itemView.context)
            .load(character.photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)

        holder.tvName.text = character.name

        holder.itemView.setOnClickListener {
            val sendCharDataIntent = Intent(holder.itemView.context, DetailActivity::class.java)
            sendCharDataIntent.putExtra(DetailActivity.EXTRA_NAME, character.name)
            sendCharDataIntent.putExtra(DetailActivity.EXTRA_ROLE, character.role)
            sendCharDataIntent.putExtra(DetailActivity.EXTRA_DETAIL, character.detail)
            sendCharDataIntent.putExtra(DetailActivity.EXTRA_IMAGE, character.photo)
            holder.itemView.context.startActivity(sendCharDataIntent)
        }
    }

    override fun getItemCount(): Int = listchar.size
}