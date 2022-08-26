package com.chama.affirmations

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.chama.affirmations.adapter.ItemAdapter
import com.chama.affirmations.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDataset = Datasource().loadAffirmations()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)


        var adapter = ItemAdapter(this, myDataset);
        adapter.setOnItemClickListener(object : ItemAdapter.onItemClickListener{
            override fun onItemClick(position: Int) {
                Toast.makeText(applicationContext,"Item on position: $position",Toast.LENGTH_SHORT).show()
            }
        })
        recyclerView.adapter = adapter
        recyclerView.setHasFixedSize(true)

    }
}