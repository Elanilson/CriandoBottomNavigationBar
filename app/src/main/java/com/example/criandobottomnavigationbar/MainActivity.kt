package com.example.criandobottomnavigationbar

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.criandobottomnavigationbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val bottomNav = binding.bottomNavMain

        val navController = findNavController(
            R.id.fragmentContainerNavMain
        )

        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.menu_item_home,
                R.id.menu_item_settings
            )
        )

        setupActionBarWithNavController(
            navController, appBarConfiguration
        )

        bottomNav.setupWithNavController( navController )
    }
}