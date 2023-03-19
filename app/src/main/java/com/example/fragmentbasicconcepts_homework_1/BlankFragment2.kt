package com.example.fragmentbasicconcepts_homework_1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast

class BlankFragment2 : Fragment() {

    lateinit var root:View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        root= inflater.inflate(R.layout.fragment_blank2, container, false)

        val tv=root.findViewById<TextView>(R.id.fragment_2)

        tv.setOnClickListener{
            Toast.makeText(context, "2-BlankFragment bosildi", Toast.LENGTH_SHORT).show()
        }

        return root
    }

}