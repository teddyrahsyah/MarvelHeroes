package com.kuronekos.marvelheroes.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.kuronekos.marvelheroes.Character
import com.kuronekos.marvelheroes.DetailActivity
import com.kuronekos.marvelheroes.R

class CardCharAdapter(private val listchar: ArrayList<Character>) :
    RecyclerView.Adapter<CardCharAdapter.CharViewHolder>() {
    inner class CharViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvRole: TextView = itemView.findViewById(R.id.tv_item_role)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_char_photo)
        var btnLove: ImageButton = itemView.findViewById(R.id.btn_love)
        var btnShare: ImageButton = itemView.findViewById(R.id.btn_share)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_card_marvel, parent, false)
        return CharViewHolder(view)
    }

    override fun onBindViewHolder(holder: CharViewHolder, position: Int) {
        val character = listchar[position]
        var isLiked = false
        Glide.with(holder.itemView.context)
            .load(character.photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)

        holder.tvName.text = character.name
        holder.tvRole.text = character.role
        holder.tvDetail.text = character.detail

        holder.btnLove.setOnClickListener {
            if (!isLiked) {
                holder.btnLove.setImageResource(R.drawable.ic_love_icon_red)
                Toast.makeText(holder.itemView.context, "Liked!", Toast.LENGTH_SHORT).show()
                isLiked = true
            } else {
                holder.btnLove.setImageResource(R.drawable.ic_love_icon)
                Toast.makeText(holder.itemView.context, "Disliked!", Toast.LENGTH_SHORT).show()
                isLiked = false
            }
        }
        holder.btnShare.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Shared!", Toast.LENGTH_SHORT).show()
        }

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