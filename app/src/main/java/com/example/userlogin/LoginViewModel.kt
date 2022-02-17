package com.example.userlogin

import android.util.Log
import android.util.Patterns
import androidx.lifecycle.ViewModel

class LoginViewModel:ViewModel() {
    lateinit var username:String
    lateinit var password:String
    private var valid:Boolean=false


    fun checkuseranme():Boolean
    {
    // val emailToText:String=username.toString()
        valid = !username.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(username).matches()
        return valid
    }
}