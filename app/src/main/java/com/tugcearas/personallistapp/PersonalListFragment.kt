package com.tugcearas.personallistapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.tugcearas.personallistapp.databinding.FragmentPersonalListBinding

class PersonalListFragment : Fragment() {

    private lateinit var binding: FragmentPersonalListBinding
    private lateinit var myAdapter: PersonalListAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPersonalListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val myList = listOf(
            PersonalListDataModel("Tugce","Aras","Istanbul"),
            PersonalListDataModel("Merve","Yonetci","Aydin"),
            PersonalListDataModel("Ahmet","Yilmaz","Mugla"),
            PersonalListDataModel("Mehmet","Kaya","Izmir"),
            PersonalListDataModel("Mehmet","Kaya","Izmir"),
            PersonalListDataModel("Mehmet","Kaya","Izmir"),
            PersonalListDataModel("Mehmet","Kaya","Izmir"),
            PersonalListDataModel("Mehmet","Kaya","Izmir"),
            PersonalListDataModel("Mehmet","Kaya","Izmir"),
            PersonalListDataModel("Mehmet","Kaya","Izmir"),
            PersonalListDataModel("Mehmet","Kaya","Izmir"),
            PersonalListDataModel("Mehmet","Kaya","Izmir"),
            PersonalListDataModel("Mehmet","Kaya","Izmir"),
            PersonalListDataModel("Mehmet","Kaya","Izmir"),
        )

        myAdapter = PersonalListAdapter(myList)
        binding.recyclerview.adapter = myAdapter
        binding.btnNext.setOnClickListener {
            Toast.makeText(context, "Toast message displayed!", Toast.LENGTH_SHORT).show()
            //Snackbar.make(it,"Snackbar is displayed!", Snackbar.LENGTH_SHORT).show()
        }
    }
}