package com.example.showherodota

import android.os.Bundle
import android.view.*
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.showherodota.Model.arcanaDotaList
import com.example.showherodota.Model.arcanaListAdapter
import com.example.showherodota.databinding.FragmentHeroDota2Binding

class FragmentHeroDota2 : Fragment() {
    private var _binding: FragmentHeroDota2Binding? = null
    private val binding get() = _binding!!
    private var isLinearLayoutManager1 = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       _binding = FragmentHeroDota2Binding.inflate(inflater,container,false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvHero2.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = arcanaListAdapter(arcanaList = arcanaDotaList.loadArcanaList())
        }
        chooseLayout()
        }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.layout_menu1,menu)

        val layoutButton = menu?.findItem(R.id.action_switch_layout1)
        setIcon(layoutButton)
    }

    private fun chooseLayout(){
        if (isLinearLayoutManager1){
            binding.rvHero2.layoutManager = LinearLayoutManager(requireContext())
        } else{
            binding.rvHero2.layoutManager = GridLayoutManager(requireContext(),2)
        }
    }

    private fun setIcon(menuItem: MenuItem?) {
        if (menuItem == null)
            return

        menuItem.icon =
            if (isLinearLayoutManager1)
                ContextCompat.getDrawable(requireContext(), R.drawable.ic_baseline_grid_on_24)
            else ContextCompat.getDrawable(requireContext(), R.drawable.ic_baseline_view_list_24)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_switch_layout1 -> {
                isLinearLayoutManager1 = !isLinearLayoutManager1
                chooseLayout()
                setIcon(item)

                return true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
}





