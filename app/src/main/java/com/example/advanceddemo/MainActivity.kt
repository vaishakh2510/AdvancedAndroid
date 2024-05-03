package com.example.advanceddemo

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val dataSource = arrayListOf("Android", "iOS", "Symbian", "Windows", "Palm")
        val adapter = CustomAdapter(dataSource)

        val recView = findViewById<RecyclerView>(R.id.recVw)
        recView.layoutManager = LinearLayoutManager(this)
        recView.adapter = adapter

    }
}