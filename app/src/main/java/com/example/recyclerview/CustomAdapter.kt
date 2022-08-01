package com.example.recyclerview

import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val mlist:List<ItemViewModel>):RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    override fun dummy() {
        val view=LayoutInflater.from(parent.context).
        inflate(R.layout.card_view_design,parent,false)
        return RecyclerView.ViewHolder(view)
    }

    override fun dummy() {}

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }


}