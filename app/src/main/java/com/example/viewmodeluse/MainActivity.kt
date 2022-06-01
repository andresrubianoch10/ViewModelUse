package com.example.viewmodeluse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodeluse.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val viewModel: MainActivityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding.mainText) {
            text = viewModel.getCurrentCount().toString()
            setOnClickListener {
                text = viewModel.getUpdatedCount().toString()
            }
        }
    }
}