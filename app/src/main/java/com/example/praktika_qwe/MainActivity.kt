package com.example.praktika_qwe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun reg(view: View){
        val regIntent = Intent(this,HomeActivity::class.java)
        startActivity(regIntent)
    }
}