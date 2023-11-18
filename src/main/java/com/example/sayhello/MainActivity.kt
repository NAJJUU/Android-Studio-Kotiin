package com.example.sayhello

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import com.example.sayhello.databinding.ActivityMainBinding


class MainActivity : ComponentActivity() {

    /*private lateinit var binding: ActivityMainBinding*/


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(R.layout.activity_main)

        binding.button.setOnClickListener{
            if(binding.textView.text.toString() == "입실"){
                binding.textView.text = "퇴실"
            } else{
                binding.textView.text = "입실"
            }
        }

        /*val button = findViewById<Button>(R.id.button)
        val text = findViewById<TextView>(R.id.textView)

        button.setOnClickListener{
            if(text.text.toString() == "입실"){
                text.text = "퇴실"
            } else{
                text.text = "입실"
            }
        }*/

    }
}


