package com.example.advanceddemo


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(
    private val list: List<String>
) : RecyclerView.Adapter<CustomAdapter.CustomViewHolder>() {

    private lateinit var listener : (position: Int) -> Unit

    class CustomViewHolder(
        val view : View
    ) : RecyclerView.ViewHolder(view) {
        val textView : TextView = view.findViewById(R.id.textView)
    }

    override fun getItemCount(): Int = list.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(
                R.layout.rec_item,
                parent,
                false
            )
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.textView.text = list.get(position)
        holder.view.setOnClickListener { listener(position) }
    }

    fun setOnItemClickListener( listener: (position: Int) -> Unit ) {
        this.listener = listener
    }
}