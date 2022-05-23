package com.example.backgroundapp


import android.content.Intent
import android.os.Bundle
import android.view.View

import androidx.appcompat.app.AppCompatActivity

import com.example.backgroundapp.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {

    lateinit var bindingClass: ActivityMainBinding

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
var bt = bindingClass.btPresent
        bt.setOnClickListener {

            val intent = Intent(this@MainActivity, PresentActivity::class.java)
            startActivity(intent)
        }



}
}



