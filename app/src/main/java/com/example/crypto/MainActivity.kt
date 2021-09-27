package com.example.crypto

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sharedPreferences = getSharedPreferences("com.example.app", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        val optionIntent = Intent(this, OptionActivity::class.java)

        if (!sharedPreferences.getString("username", "").isNullOrEmpty() && !sharedPreferences.getString("password","").isNullOrEmpty()) {
            startActivity(optionIntent)
        } else {
            Log.i("Khoa", "unsuccessful")
        }

        btnLogin.setOnClickListener {
            editor.putString("username", userName.text.toString())
            editor.putString("password", password.text.toString())
            editor.apply()
            startActivity(optionIntent)
        }
    }
}