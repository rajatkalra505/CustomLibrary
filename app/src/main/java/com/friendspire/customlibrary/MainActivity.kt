package com.friendspire.customlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.friendspire.mylibrary.MyToast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MyToast().tost(baseContext,"hello")
    }
}