package com.itacademy.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.itacademy.recyclerview.adapters.CustomAdapter
import com.itacademy.recyclerview.adapters.Pictures

class MainActivity : AppCompatActivity() {

    val pictures = arrayListOf(
        Pictures("Аргентина", R.drawable.argentina),
        Pictures("Канада", R.drawable.canada),
        Pictures("Франция", R.drawable.france),
        Pictures("Португалия", R.drawable.portugal),
        Pictures("Кыргызстан", R.drawable.kyrgyzstan))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CustomAdapter(pictures)

    }
}