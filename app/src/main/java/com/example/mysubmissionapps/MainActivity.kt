package com.example.mysubmissionapps

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.Menu
import android.view.MenuItem
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var rv_player: RecyclerView
    private var list: ArrayList<Player> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_player = findViewById(R.id.rv_player)
        rv_player.setHasFixedSize(true)

        list.addAll(PlayerData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rv_player.layoutManager = LinearLayoutManager(this)
        val listPlayerAdapter = ListPlayerAdapter(list)
        rv_player.adapter = listPlayerAdapter

        listPlayerAdapter.setOnItemClickCallback(object : ListPlayerAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Player){
                showPlayerDetail(data)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean{
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int){
        when (selectedMode) {
            R.id.actMenu -> {

            }
            R.id.actAbout -> {
                val moveIntent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }

    private fun showPlayerDetail(player: Player){
        val i = Intent(this@MainActivity, DetailPlayer::class.java)
        i.putExtra("player", player)
        startActivity(i)
    }
}
