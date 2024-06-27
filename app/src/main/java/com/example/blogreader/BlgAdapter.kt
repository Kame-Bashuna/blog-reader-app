package com.example.blogreader

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BlgAdapter(var authorList:List<Blgr>):RecyclerView.Adapter<BlogsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlogsViewHolder {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.authors_profile_blog,parent,false)
        return BlogsViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return authorList.size
    }

    override fun onBindViewHolder(holder: BlogsViewHolder, position: Int) {
        val author=authorList[position]
        holder.tvDate.text=author.publishDate
        holder.tvTitle.text=author.title
        holder.tvName.text=author.author
    }

}

class BlogsViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
    var tvDate=itemView.findViewById<TextView>(R.id.tvDate)
    var tvTitle=itemView.findViewById<TextView>(R.id.tvTittle)

}