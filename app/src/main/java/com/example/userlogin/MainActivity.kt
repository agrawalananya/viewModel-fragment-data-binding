package com.example.userlogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.databinding.DataBindingUtil
import com.example.userlogin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      //  binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
       // val fragment:LoginFragment=LoginFragment()

        val firstfrag=LoginFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_container,firstfrag)
            commit()
        }
    }
}