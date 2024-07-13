package com.akirachix.suubi_app

import android.content.Intent
import android.os.Bundle

class onsaving {
    lateinit var binding: ActivityOnsavingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityOnsavingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.setupTitle.setOnClickListener{
            val intent = Intent(this, savingcheck::class.java)
            startActivity(intent)
        }
    }
}