package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_counter.*

class CounterActivity : AppCompatActivity() {

    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter)

        tvtext.setText("" + count)

        btnplus.setOnClickListener {
            tvtext.setText("" + ++count)
        }

        btnminus.setOnClickListener {
            tvtext.setText("" + --count)
        }
    }
}