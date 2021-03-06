package org.example.app.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import org.example.app.R

class SplashScreenActivity : AppCompatActivity() {

    private val timeOut: Long = 2000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed({
            startActivity(Intent(this, ConfigActivity::class.java))
            finish()
        }, timeOut)
    }
}