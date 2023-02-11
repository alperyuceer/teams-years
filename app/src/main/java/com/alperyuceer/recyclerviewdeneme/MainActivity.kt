package com.alperyuceer.recyclerviewdeneme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.alperyuceer.recyclerviewdeneme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var teamList: ArrayList<Team>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        teamList = ArrayList<Team>()

        val fb = Team("FENERBAHÇE",1907)
        val gs = Team("GALATASARAY", 1905)
        val bjk = Team("BEŞİKTAŞ",1903)
        val mke = Team("MKE ANKARAGÜCÜ",1910)
        val ts = Team("TRABZONSPOR",1961)


        teamList.add(fb)
        teamList.add(gs)
        teamList.add(bjk)
        teamList.add(mke)
        teamList.add(ts)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = TeamAdapter(teamList)
        binding.recyclerView.adapter = adapter





    }
}