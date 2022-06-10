package com.friendspire.mylibrary

import android.content.Context
import android.widget.Toast

public  class MyToast {
   public fun tost(context: Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }
}