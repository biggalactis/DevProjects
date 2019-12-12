package com.example.devprojects

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bitmap = BitmapFactory.decodeResource(resources, R.drawable.devslopesprofilelogo)
        val rounded = RoundedBitmapDrawableFactory.create(resources, bitmap)
        rounded.cornerRadius = 15f
        logo.setImageDrawable(rounded)

        val batmap = BitmapFactory.decodeResource(resources, R.drawable.andy)
        val round = RoundedBitmapDrawableFactory.create(resources, batmap)
        round.cornerRadius = 60f
        andy1.setImageDrawable(round)
    }


    }
