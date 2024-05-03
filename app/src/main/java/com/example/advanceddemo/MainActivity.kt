package com.example.advanceddemo


import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ItemDecoration

class MainActivity : AppCompatActivity() {

    private fun showListView() {
        val dataSource = arrayListOf("Android", "iOS", "Symbian", "Windows", "Palm")
        val adapter = CustomAdapter(dataSource)

        val recView = findViewById<RecyclerView>(R.id.recVw)
        recView.layoutManager = LinearLayoutManager(this)
        recView.addItemDecoration(DividerItemDecoration(recView.context, DividerItemDecoration.VERTICAL))
        recView.adapter = adapter
    }

    private fun showGridView() {

        val dataSource = arrayListOf<GridItem>(
            GridItem(ic = R.drawable.baseline_build_circle_24, lbl = "Settings"),
            GridItem(ic = R.drawable.baseline_call_end_24, lbl = "Phone"),
            GridItem(ic = R.drawable.baseline_call_missed_outgoing_24, lbl = "Call"),
            GridItem(ic = R.drawable.baseline_bolt_24, lbl = "Hotspot"),
            GridItem(ic = R.drawable.baseline_connect_without_contact_24, lbl = "Wifi"),
        )
        val adapter = GridAdapter(dataSource)

        val recView = findViewById<RecyclerView>(R.id.recVw)
        recView.adapter = adapter
        recView.layoutManager = GridLayoutManager(recView.context, 2)
        recView.addItemDecoration(DividerItemDecoration(recView.context, DividerItemDecoration.VERTICAL))
        recView.addItemDecoration(DividerItemDecoration(recView.context, DividerItemDecoration.HORIZONTAL))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        showGridView()

    }
}