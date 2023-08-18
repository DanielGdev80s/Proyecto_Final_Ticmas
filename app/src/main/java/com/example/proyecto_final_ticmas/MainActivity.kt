package com.example.proyecto_final_ticmas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.proyecto_final_ticmas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: ComparisonViewModel
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(ComparisonViewModel::class.java)

        binding.compareButton.setOnClickListener {
            val value1 = binding.editText1.text.toString()
            val value2 = binding.editText2.text.toString()
            val result = viewModel.compareValues(value1, value2)
            binding.resultTextView.text = result
        }
    }
}

