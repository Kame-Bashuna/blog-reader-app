package com.example.blogreader

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BlgAdapter(var contactList:List<Blgr>):RecyclerView.Adapter<BlogsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlogsViewHolder {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.authors_profile_blog,parent,false)
        return BlogsViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return contactList.size
    }

    override fun onBindViewHolder(holder: BlogsViewHolder, position: Int) {
        val contact=contactList[position]
        holder.tvDate.text=contact.publishDate
        holder.tvTitle.text=contact.title
        holder.tvName.text=contact.author
    }

}

class BlogsViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
    var tvDate=itemView.findViewById<TextView>(R.id.tvDate)
    var tvTitle=itemView.findViewById<TextView>(R.id.tvTittle)

}