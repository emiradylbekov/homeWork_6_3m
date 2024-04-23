package com.example.homework_6_3m

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.homework_6_3m.databinding.FragmentFootballClubBinding

class FootballClubFragment : Fragment() {
    private lateinit var binding: FragmentFootballClubBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFootballClubBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
    }

    private fun initAdapter() {
        val adapter = FootballClubAdapter(
            arrayListOf(
                FootballClub("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1b/FC_Bayern_M%C3%BCnchen_logo_%282017%29.svg/2048px-FC_Bayern_M%C3%BCnchen_logo_%282017%29.svg.png", "Bayern Munic"),
                FootballClub("https://w7.pngwing.com/pngs/377/288/png-transparent-real-madrid-c-f-hd-logo-thumbnail.png","Real Madrid"),
                FootballClub("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSZrXQDZxjuoO8gpV1AAsXjjfr4d_Q_2aB0ffg4tA59FA&s","Barcelona"),
                FootballClub("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRFxU60x7iLoeEPg5-XNtnhGe8f9bh4ltIujcgWYwOYDQ&s","Manchester United"),
                FootballClub("https://d1yjjnpx0p53s8.cloudfront.net/styles/logo-thumbnail/s3/072016/untitled-2_0.png?itok=0f43Nsyh","Manchester city"),
                FootballClub("https://upload.wikimedia.org/wikipedia/hif/8/82/Arsenal_FC.png","Arsenal"),
                FootballClub("https://upload.wikimedia.org/wikipedia/sco/thumb/c/cc/Chelsea_FC.svg/2048px-Chelsea_FC.svg.png","Chelsea"),
                FootballClub("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSi0n8xPPnJowDLQJaxU5L6W9TR3FBJS_x_L6o1uC4BHA&s","PSG"),
                FootballClub("https://logowik.com/content/uploads/images/526_liverpoolfc.jpg","Liverpool"),
                FootballClub("https://upload.wikimedia.org/wikipedia/commons/d/da/Juventus_Logo.png","Juventus"),
                FootballClub("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d0/Logo_of_AC_Milan.svg/361px-Logo_of_AC_Milan.svg.png","Milan"),
                FootballClub("https://w7.pngwing.com/pngs/142/608/png-transparent-inter-milan-serie-a-fc-internazionale-milano-logo-a-c-milan-football-emblem-trademark-logo.png","Inter Milan"),
                FootballClub("https://seeklogo.com/images/A/atletico-madrid-new-logo-6AC4CCB6A2-seeklogo.com.png","Atletico Madrid"),
                FootballClub("https://e7.pngegg.com/pngimages/277/73/png-clipart-bayer-04-leverkusen-bundesliga-fc-barcelona-fc-barcelona-text-logo-thumbnail.png","Bayer Leverkusen")
            )
        )
        binding.rvFootballClub.adapter = adapter
    }

}