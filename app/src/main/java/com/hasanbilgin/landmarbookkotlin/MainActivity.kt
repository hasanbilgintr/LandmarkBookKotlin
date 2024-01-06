package com.hasanbilgin.landmarbookkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.hasanbilgin.landmarbookkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    private lateinit var arrayList: ArrayList<Model>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        arrayList = ArrayList<Model>()
        //Data
        val pisa = Model("Pisa", "Italy", R.drawable.pisa)
        val colosseum = Model("Colosseum", "Italy", R.drawable.colesseo)
        val eiffel = Model("Eiffel", "France", R.drawable.eiffel)
        val londonBridge = Model("London Bridge", "UK", R.drawable.londonbridge)

        arrayList.add(pisa)
        arrayList.add(colosseum)
        arrayList.add(eiffel)
        arrayList.add(londonBridge)
        /*
        //adapter /layout & data
        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            arrayList.map { arrayList -> arrayList.name })

        binding.listview.adapter = adapter

        binding.listview.onItemClickListener =
            AdapterView.OnItemClickListener { parent, view, position, id ->
                var intent = Intent(MainActivity@ this, DetailsActivity::class.java)

                intent.putExtra("model", arrayList.get(position))
                startActivity(intent)

            }
        */




        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val landmarkAdapter = LandmarkAdapter(arrayList)
        binding.recyclerView.adapter = landmarkAdapter
    }
}