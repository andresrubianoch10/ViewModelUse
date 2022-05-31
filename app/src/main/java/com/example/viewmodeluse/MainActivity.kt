package com.example.viewmodeluse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewmodeluse.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with (binding.mainText) {
            text = "1"
            setOnClickListener {
                var actualValue = 0
                actualValue += (text as String).toInt() + 1
                text = actualValue.toString()
            }
        }

    }
}