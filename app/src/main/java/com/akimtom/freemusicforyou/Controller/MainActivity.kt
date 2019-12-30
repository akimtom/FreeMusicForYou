package com.akimtom.freemusicforyou.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.OnClickAction
import android.view.View
import com.akimtom.freemusicforyou.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_playList.setOnClickListener {

            val intent = Intent( this, PlayListActivity::class.java)

            startActivity(intent)

        }
    }
}
