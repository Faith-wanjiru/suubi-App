package com.akirachix.suubi_app

import android.content.Intent
import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.suubi_app.databinding.ActivityMainBinding
import com.akirachix.suubi_app.databinding.ActivityStatementsBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStatement.setOnClickListener{
            val intent = Intent(this, statements::class.java)
            startActivity(intent)
        }
        binding.btnReport.setOnClickListener{
            val intent = Intent(this, statements::class.java)
            startActivity(intent)
        }

    }
}