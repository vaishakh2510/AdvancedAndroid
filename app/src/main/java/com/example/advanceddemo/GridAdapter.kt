package com.example.advanceddemo



import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


data class GridItem(
    var lbl: String,
    var ic: Int
)

class GridAdapter(
    private val list: List<GridItem>
): RecyclerView.Adapter<GridAdapter.GridViewHolder>() {

    class GridViewHolder(
        view: View
    ): RecyclerView.ViewHolder(view) {
        val imgIc: ImageView
        val txLbl: TextView

        init {
            imgIc = view.findViewById<ImageView>(R.id.imageView2)
            txLbl = view.findViewById<TextView>(R.id.textView2)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.grid_item, parent, false)

        return  GridViewHolder(view)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        holder.imgIc.setImageResource(list.get(position).ic)
        holder.txLbl.text = list.get(position).lbl
    }
}