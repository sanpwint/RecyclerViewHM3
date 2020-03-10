package com.example.recyclerviewhm3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var thingsArray = ArrayList<Things>()

        thingsArray.add(Things("Nike Superfly 6 Elite FG","$799",R.drawable.shoe1))
        thingsArray.add(Things("Air Vapormax Flyknil","Price - $1280",R.drawable.shoe2))
        thingsArray.add(Things("Air Jordan 14 Retro Se","Price - $2400",R.drawable.shoe3))
        thingsArray.add(Things("Lebron XVI Low EP","Price - $1099",R.drawable.shoe4))
        thingsArray.add(Things("Jordan Why Not Zero0.2 PF","Price - $2699",R.drawable.shoe5))
        thingsArray.add(Things("LeBron XVI SB EP","Price - $1280",R.drawable.shoe6))

        var thingsAdapter = ThingsAdapter(thingsArray)

        recyclerview.layoutManager = GridLayoutManager(this,2)
        recyclerview.adapter = thingsAdapter
        recyclerview.setHasFixedSize(true)
    }
}
