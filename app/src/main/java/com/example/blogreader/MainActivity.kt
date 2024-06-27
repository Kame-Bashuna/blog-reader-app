package com.example.blogreader

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.blogreader.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvBlog.layoutManager= LinearLayoutManager(this)
        displayContacts()

    }



    fun displayContacts(){
        val blog1=Blgr("Hopeless","Ali Noor","07-12-2000",)
        val blog2=Blgr("RoseBlic","Rose David","07-12-2001")
        val blog3=Blgr("Hello World","Alec Mike","5-7-2023")
        val blog4=Blgr("Born a crime","Trevor Noah","01-1-23")
        val blog5=Blgr("Awhile back","Davi Kile","01-1-23")
        val blog6=Blgr("Give a world a chance","Bile Bine","05-1-23")
        val blog7=Blgr("Tumbo Lisosiba","Trev Kine","04-1-23")
        val blog8=Blgr("Pearl","Angie with","06-1-23")

        val blog=listOf(blog1,blog2,blog3,blog4,blog5,blog6,blog7,blog8)

        val blgAdapter=BlgAdapter(blog)
        binding.rvBlog.adapter=blgAdapter
    }}