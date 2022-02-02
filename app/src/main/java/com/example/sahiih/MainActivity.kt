package com.example.sahiih

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.widget.Toolbar
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.sahiih.databinding.MainActivityBinding
import com.example.sahiih.ui.main.HomeFragment

const val LOG_TAG = "lifecycle_monitor"

class MainActivity : AppCompatActivity() {

    private lateinit var binding: MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.i(LOG_TAG, "on create")


        if (savedInstanceState != null) return

        supportFragmentManager.commit {
            add<HomeFragment>(R.id.container, null)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }
}