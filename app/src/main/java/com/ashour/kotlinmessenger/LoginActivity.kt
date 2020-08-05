package com.ashour.kotlinmessenger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        onClick()
    }

    private fun onClick() {
        btn_login.setOnClickListener {

        }
        tv_back.setOnClickListener {
            finish()
        }
    }
}
