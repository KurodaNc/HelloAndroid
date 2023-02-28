package com.example.helloandroid.extension.Activity

import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
//import androidx.appcompat.app.AppCompatCallback

fun AppCompatActivity.alert(msg: String, callback: () -> Unit = {}) {
    val dialog = AlertDialog.Builder(this).create()
    dialog.setTitle("Android")
    dialog.setMessage(msg)
    dialog.setButton(
        AlertDialog.BUTTON_NEUTRAL, "OK"
    ) {_, which ->
        dialog.dismiss()
        callback() // aqui chamamos a funcao callback
    }
    dialog.show()
}