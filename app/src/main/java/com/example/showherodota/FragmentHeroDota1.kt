package com.example.showherodota

import android.os.Bundle
import android.view.*
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.showherodota.Model.dotaHeroAdapter
import com.example.showherodota.Model.dotaHeroList
import com.example.showherodota.databinding.FragmentHeroDota1Binding


class FragmentHeroDota1:Fragment() {
    private var _binding: FragmentHeroDota1Binding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    companion object{
        const val SEARCH_PREFIX = "https://dota2.fandom.com/wiki/Special:Search?query="
    }
    private val binding get() = _binding!!


    private var isLinearLayoutManager = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHeroDota1Binding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvHero.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = dotaHeroAdapter(dotaList = dotaHeroList.loadHeroList())
        }
        chooseLayout()
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.layout_menu,menu)

        val layoutButton = menu?.findItem(R.id.action_switch_layout)
        setIcon(layoutButton)
    }

    private fun chooseLayout(){
        if (isLinearLayoutManager){
            binding.rvHero.layoutManager = LinearLayoutManager(activity)
        } else{
            binding.rvHero.layoutManager = GridLayoutManager(activity,2)
        }
    }

    private fun setIcon(menuItem: MenuItem?) {
        if (menuItem == null)
            return

        menuItem.icon =
            if (isLinearLayoutManager)
                ContextCompat.getDrawable(this.requireContext(), R.drawable.ic_baseline_grid_on_24)
            else ContextCompat.getDrawable(this.requireContext(), R.drawable.ic_baseline_view_list_24)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_switch_layout -> {
                isLinearLayoutManager = !isLinearLayoutManager
                chooseLayout()
                setIcon(item)

                return true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
    }




