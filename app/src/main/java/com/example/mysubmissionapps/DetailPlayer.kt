package com.example.mysubmissionapps

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_detail_player.*
import kotlinx.android.synthetic.main.activity_detail_player.view.*
import kotlinx.android.synthetic.main.activity_detail_player.view.tvPlayerName
import kotlinx.android.synthetic.main.item_row_player.*

class DetailPlayer : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_player)

        val player: Player = intent.getParcelableExtra("player")
        showPlayerDetail(player)
    }

    fun showPlayerDetail(player: Player){

        Glide.with(this).load(player.photo).into(imgPlayer)

        tvPlayerName.text = player.name
        tvPositionPlayer.text = player.position
        tvAbout.text = player.talk
        tvCountry2.text = player.country
        tvBirth2.text = player.birth
    }
}
