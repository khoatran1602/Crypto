package com.example.crypto

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_option.*

class OptionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_option)

        val converterIntent = Intent(this, ConverterActivity::class.java)
        val currencyIntent = Intent(this, CurrencyActivity::class.java)

        btnCryptoOption.setOnClickListener {
            startActivity(converterIntent)
        }

        btnCurrencyOption.setOnClickListener {
            startActivity(currencyIntent)
        }


    }
}