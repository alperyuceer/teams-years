package com.alperyuceer.recyclerviewdeneme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.alperyuceer.recyclerviewdeneme.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent
        val selectedTeamintent= intent.getSerializableExtra("teams") as Team
        binding.teamYearText.text = selectedTeamintent.teamYear.toString()

    }
}