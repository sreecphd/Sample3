package com.example.navigation.myapplication

import android.content.Context

class ResourceComparer {

    fun isEquals(con: Context, id : Int, s: String) : Boolean{
       return con.getString(id) == s
    }
}