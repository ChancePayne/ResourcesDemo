package com.lambdaschool.resourcesdemo

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println(R.color.colorAccent.toString())
        println(ContextCompat.getColor(this, R.color.colorAccent).toString())

        demo_text.text = getString(R.string.app_name)

        demo_text.background = ContextCompat.getDrawable(this, R.drawable.ic_launcher_foreground)

        demo_text.setBackgroundColor(ContextCompat.getColor(this, R.color.myColorTrial))
    }
}
