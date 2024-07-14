package com.akirachix.suubi_app

import android.content.Intent
import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.suubi_app.databinding.ActivityStatementsBinding

class statements : AppCompatActivity() {
lateinit var binding: ActivityStatementsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
binding = ActivityStatementsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener{
            val intent = Intent(this, report_statements::class.java)
            startActivity(intent)
        }

    }
}