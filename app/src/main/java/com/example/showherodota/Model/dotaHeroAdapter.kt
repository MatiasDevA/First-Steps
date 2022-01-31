package com.example.showherodota.Model


import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.showherodota.FragmentHeroDota1
import com.example.showherodota.FragmentHeroDota1Directions
import com.example.showherodota.R
import com.example.showherodota.databinding.ListItemBinding

class dotaHeroAdapter(private val dotaList:List<heroDota>):RecyclerView.Adapter<dotaHeroAdapter.dotaHeroViewHolder>(){


    class dotaHeroViewHolder(view:View):RecyclerView.ViewHolder(view) {
        private val binding = ListItemBinding.bind(view)

        fun listView(listHero: heroDota) {
            binding.ivHero.setImageResource(listHero.imageResourceId)
            binding.tvHero.text = listHero.name
            binding.tv1Hero.text = listHero.attribute
            binding.tv2Hero.text = binding.tv2Hero.resources.getText(listHero.stringResourceId)
            binding.ivHero.setOnClickListener { Toast.makeText(binding.ivHero.context, "Hero: (${listHero.name})", Toast.LENGTH_SHORT).show()}
            binding.btnHero2.setOnClickListener{ val action =
                        FragmentHeroDota1Directions.actionFragmentHeroDota1ToFragmentHeroDota2(binding.ivHero.toString())
                Navigation.findNavController(binding.btnHero).navigate(action)
                }
                //itemView.setOnClickListener{otherOnClickListener(listHero)
                //  val action = FragmentHeroDota1Directions.actionFragmentHeroDota1ToFragmentHeroDota2(fragment2 = binding.ivHero.toString())
                //  Navigation.findNavController(itemView).navigate(action)}
                binding.btnHero.setOnClickListener {
                    val item = listHero.name
                    val queryUri: Uri = Uri.parse("${FragmentHeroDota1.SEARCH_PREFIX}${item}")
                    val intent = Intent(Intent.ACTION_VIEW, queryUri)
                    binding.btnHero.context.startActivity(intent)
                    //val action = FragmentHeroDota1Directions.actionFragmentHeroDota1ToFragmentHeroDota2(fragment2 = binding.btnHero.toString())
                    // Navigation.findNavController(itemView).navigate(action)
                }
            }
        }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): dotaHeroAdapter.dotaHeroViewHolder {
       val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return dotaHeroAdapter.dotaHeroViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: dotaHeroAdapter.dotaHeroViewHolder, position: Int) {
      val item = dotaList[position]
        holder.listView(item)
    }

    override fun getItemCount(): Int {
        return dotaList.size
    }
    }
