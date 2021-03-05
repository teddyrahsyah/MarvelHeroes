package com.kuronekos.marvelheroes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatDelegate

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_ROLE = "extra_role"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_IMAGE = "extra_image"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        supportActionBar?.title = "Marvel Studios"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val tvCharName: TextView = findViewById(R.id.tv_char_name)
        val tvCharRole: TextView = findViewById(R.id.tv_char_role)
        val tvCharDetail: TextView = findViewById(R.id.tv_char_detail)
        val tvCharImage: ImageView = findViewById(R.id.img_char_photo)

        tvCharName.text = intent.getStringExtra(EXTRA_NAME)
        tvCharRole.text = intent.getStringExtra(EXTRA_ROLE)
        tvCharDetail.text = intent.getStringExtra(EXTRA_DETAIL)
        tvCharImage.setImageResource(intent.getIntExtra(EXTRA_IMAGE, R.drawable.ironman))
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}