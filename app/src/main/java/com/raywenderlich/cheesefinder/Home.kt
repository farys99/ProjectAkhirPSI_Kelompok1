package com.raywenderlich.cheesefinder

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Home : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.beranda_fix)
        val buttonCari = findViewById<Button>(R.id.buttonCari)
        buttonCari.setOnClickListener {
            val intent = Intent(this, CheeseActivity::class.java)
            startActivity(intent)
        }
        val buttonClose = findViewById<Button>(R.id.buttonKeluar)
        buttonClose.setOnClickListener {
            finish();
            System.exit(0);
        }
    }
}