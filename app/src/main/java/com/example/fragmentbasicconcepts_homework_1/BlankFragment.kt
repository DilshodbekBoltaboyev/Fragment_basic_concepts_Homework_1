package com.example.fragmentbasicconcepts_homework_1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast

class BlankFragment : Fragment() {

    lateinit var root: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        root= inflater.inflate(R.layout.fragment_blank, container, false)

        val tv=root.findViewById<TextView>(R.id.fragment_1)

        tv.setOnClickListener{
            Toast.makeText(context, "1-BlankFragment bosildi", Toast.LENGTH_SHORT).show()
        }

        return root
    }

}