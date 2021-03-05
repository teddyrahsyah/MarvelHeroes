package com.kuronekos.marvelheroes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatDelegate
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kuronekos.marvelheroes.adapters.CardCharAdapter
import com.kuronekos.marvelheroes.adapters.GridCharAdapter
import com.kuronekos.marvelheroes.adapters.ListCharAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var rvMarvel: RecyclerView
    private var list: ArrayList<Character> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        supportActionBar?.title = "Marvel Studios"

        rvMarvel = findViewById(R.id.rv_marvel)
        rvMarvel.setHasFixedSize(true)

        list.addAll(CharactersData.listData)

        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvMarvel.layoutManager = LinearLayoutManager(this)
        val listCharAdapter = ListCharAdapter(list)
        rvMarvel.adapter = listCharAdapter
    }

    private fun showRecyclerGrid() {
        rvMarvel.layoutManager = GridLayoutManager(this, 2)
        val gridCharAdapter = GridCharAdapter(list)
        rvMarvel.adapter = gridCharAdapter
    }

    private fun showRecyclerCard() {
        rvMarvel.layoutManager = LinearLayoutManager(this)
        val cardCharAdapter = CardCharAdapter(list)
        rvMarvel.adapter = cardCharAdapter
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection
        return when (item.itemId) {
            R.id.action_about -> {
                Intent(this@MainActivity, AboutActivity::class.java).also {
                    startActivity(it)
                }
                true
            }
            R.id.action_list -> {
                showRecyclerList()
                true
            }
            R.id.action_grid -> {
                showRecyclerGrid()
                true
            }
            R.id.action_card -> {
                showRecyclerCard()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}