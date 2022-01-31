package com.example.showherodota.Model

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.annotation.StringRes
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.showherodota.FragmentHeroDota1
import com.example.showherodota.FragmentHeroDota2Directions
import com.example.showherodota.R
import com.example.showherodota.databinding.FragmentHeroDota2Binding
import com.example.showherodota.databinding.ListItem2Binding

class arcanaListAdapter(private val arcanaList:List<arcanadota>):RecyclerView.Adapter<arcanaListAdapter.arcanaDotaViewHolder>(){


    class arcanaDotaViewHolder(view:View):RecyclerView.ViewHolder(view) {
        private val binding = ListItem2Binding.bind(view)

        fun arcanaViewList(listArcana:arcanadota){
            binding.tvHero2.text = listArcana.name
            binding.tv1Hero2.text = listArcana.attribute
            binding.tv2Hero2.text = binding.tv2Hero2.resources.getText(listArcana.fraseResourceId)
            binding.ivHero2.setImageResource(listArcana.imageResourceId)
            binding.btnHero22.setOnClickListener {
                val action = FragmentHeroDota2Directions.actionFragmentHeroDota2ToFragmentHeroDota1(binding.btnHero22.toString())
                Navigation.findNavController(binding.btnHero2).navigate(action)
            }
            binding.ivHero2.setOnClickListener{
                Toast.makeText(binding.ivHero2.context,"Hero(${listArcana.name})",Toast.LENGTH_SHORT).show()
            }
            binding.btnHero2.setOnClickListener {
                val item = listArcana.name
                val queryUri: Uri = Uri.parse("${FragmentHeroDota1.SEARCH_PREFIX}${item}")
                val intent = Intent(Intent.ACTION_VIEW, queryUri)
                binding.btnHero2.context.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): arcanaListAdapter.arcanaDotaViewHolder {
       val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item2,parent,false)
        return arcanaListAdapter.arcanaDotaViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: arcanaListAdapter.arcanaDotaViewHolder, position: Int) {
       val item = arcanaList[position]
        holder.arcanaViewList(item)
    }

    override fun getItemCount(): Int {
        return arcanaList.size
    }
}