package com.garciafrancisco.pokemonapp.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.garciafrancisco.pokemonapp.R
import com.garciafrancisco.pokemonapp.R.layout
import com.garciafrancisco.pokemonapp.data.model.Pokemon

class PokemonAdapter : RecyclerView.Adapter<PokemonAdapter.PokemonViewHolder>() {
    inner class PokemonViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val pokemonName: TextView = itemView.findViewById<TextView>(R.id.tvPokemonListItemName)
        val pokemonSprite: ImageView =
            itemView.findViewById<ImageView>(R.id.ivPokemonListItemSprite)
    }

    private val differCallback = object : DiffUtil.ItemCallback<Pokemon>() {
        override fun areItemsTheSame(oldItem: Pokemon, newItem: Pokemon): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(
            oldItem: Pokemon,
            newItem: Pokemon
        ): Boolean {
            return oldItem == newItem
        }
    }

    val differ = AsyncListDiffer(this, differCallback)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        return PokemonViewHolder(
            LayoutInflater.from(parent.context).inflate(
                layout.pokemon_list_item,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        val pokemon = differ.currentList[position]

        holder.apply {
            Glide.with(this.itemView.context).load(pokemon.name).into(pokemonSprite)
            pokemonName.text = pokemon.name
            setOnItemClickListener {
                onItemClickListener?.let { it(pokemon) }
            }
        }
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    private var onItemClickListener: ((Pokemon) -> Unit)? = null

    fun setOnItemClickListener(listener: (Pokemon) -> Unit) {
        onItemClickListener = listener
    }
}