package com.example.gallery

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.picassorecyclerview.databinding.ActivityMainBinding


class MainActivity : ComponentActivity() {
        private lateinit var binding: ActivityMainBinding
        var recyclerView: RecyclerView? = null
        var Manager: GridLayoutManager? = null
        var adapter: RecyclerAdapter? = null
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityMainBinding.inflate(layoutInflater)
            val view = binding.root
            setContentView(view)


            recyclerView = findViewById<View>(R.id.rv_design) as RecyclerView
            Manager = GridLayoutManager(this,2)
            recyclerView!!.layoutManager = Manager
            adapter = RecyclerAdapter(this@MainActivity)
            recyclerView!!.adapter = adapter
        }
    }