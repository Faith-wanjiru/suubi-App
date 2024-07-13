package com.akirachix.suubi_app

import android.content.Intent
import android.os.Bundle

class savingpageActivity {
    lateinit var binding: ActivitySavingpageAvtivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySavingpageAvtivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.setupSavingsButton.setOnClickListener{
            val intent = Intent(this, savingcheck::class.java)
            startActivity(intent)
        }
    }
}