package com.example.backgroundapp.activity


import android.content.Intent
import android.os.Bundle
import android.widget.Toast


import androidx.appcompat.app.AppCompatActivity

import com.example.backgroundapp.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {

    lateinit var bindingClass: ActivityMainBinding

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)


        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
    val bt = bindingClass.btPresent
    val bt2 = bindingClass.tvFashion
        val bt2F= bindingClass.iVFashion
        val bt3F=bindingClass.iVBusiness
        val bt3=bindingClass.tvBusiness
val btr=bindingClass.btRandom
        btr.setOnClickListener{
            Toast.makeText(this, "Будет реализовано в будущем", Toast.LENGTH_SHORT)
        }
        bt.setOnClickListener {

            val intent = Intent(this@MainActivity, PresentActivity::class.java)
            startActivity(intent)
        }
bt2.setOnClickListener{
    val intent = Intent(this@MainActivity, FashionActivity::class.java)
    startActivity(intent)
}
        bt2F.setOnClickListener{
    val intent = Intent(this@MainActivity, FashionActivity::class.java)
    startActivity(intent)
}
        bt3.setOnClickListener{
    val intent = Intent(this@MainActivity, BusinessActivity::class.java)
    startActivity(intent)
}
        bt3F.setOnClickListener{
    val intent = Intent(this@MainActivity, BusinessActivity::class.java)
    startActivity(intent)
}


}
}



