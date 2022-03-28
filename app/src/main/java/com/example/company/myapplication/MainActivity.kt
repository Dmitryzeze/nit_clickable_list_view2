package com.example.company.myapplication

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dataArray = MutableList(5) { x -> "${x+1}" }
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dataArray)
        val listView = findViewById<ListView>(R.id.listView1)
        listView.adapter = adapter
        listView.setOnItemClickListener { _: AdapterView<*>, view1: View, _: Int, _: Long ->
            val intent = Intent(this, ListItemActivity::class.java)
            intent.putExtra("text", (view1 as TextView).text.toString())
            startActivity(intent)
        }


    }
}
