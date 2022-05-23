package com.example.backgroundapp


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.Window

import androidx.appcompat.app.AppCompatActivity

import com.example.backgroundapp.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {

    lateinit var bindingClass: ActivityMainBinding

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)


        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
    var bt = bindingClass.btPresent
    var bt2 = bindingClass.tvFashion
        var bt2F= bindingClass.iVFashion
        var bt3F=bindingClass.iVBusiness
        var bt3=bindingClass.tvBusiness

        bt.setOnClickListener {

            val intent = Intent(this@MainActivity, PresentActivity::class.java)
            startActivity(intent)
        }
bt2.setOnClickListener{
    val intent = Intent(this@MainActivity,FashionActivity::class.java)
    startActivity(intent)
}
        bt2F.setOnClickListener{
    val intent = Intent(this@MainActivity,FashionActivity::class.java)
    startActivity(intent)
}
        bt3.setOnClickListener{
    val intent = Intent(this@MainActivity,BusinessActivity::class.java)
    startActivity(intent)
}
        bt3F.setOnClickListener{
    val intent = Intent(this@MainActivity,BusinessActivity::class.java)
    startActivity(intent)
}


}
}



