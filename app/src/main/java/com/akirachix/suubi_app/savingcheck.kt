package com.akirachix.suubi_app

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle

class savingcheck {
    lateinit var binding: ActivitySavingcheckBinding
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySavingcheckBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.check.setOnClickListener{
            val intent = Intent(this, onsaving::class.java)
            startActivity(intent)
        }
    }
}