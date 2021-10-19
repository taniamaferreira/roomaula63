package com.example.roomaula63

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.roomaula63.home.view.ListaFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment, ListaFragment())
            .commit()

    }
}