package com.example.updatedvaccines

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class splashscreen : AppCompatActivity() {

      val SPLASH_SCREEN = 5000

      private lateinit var topAnimation: Animation
      private  lateinit var bottomAnimation: Animation

      private lateinit var imageView: ImageView
      private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)


        topAnimation = AnimationUtils.loadAnimation(this,R.anim.top_animation)
        bottomAnimation = AnimationUtils.loadAnimation(this,R.anim.bottom_animation)

        imageView = findViewById(R.id.icon_image)
        textView = findViewById(R.id.TextView)

        imageView.animation = topAnimation
        textView.animation = bottomAnimation

        Handler().postDelayed( {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()

        }, SPLASH_SCREEN.toLong())

    }
}