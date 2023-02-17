package com.example.helloandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

//comentario de alteracao 1.1
//comentario do github
class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btLogin).setOnClickListener(object: View.OnClickListener{
            override fun onClick(view: View?){
                startActivity(Intent(this@MainActivity,HomeActivity::class.java))
            }
        })
        findViewById<TextView>(R.id.btEsqueciSenha).setOnClickListener(this)
        findViewById<TextView>(R.id.btCadastrar).setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when(view?.id) {
            R.id.btLogin -> {
                startActivity(Intent(this,HomeActivity::class.java))
            }
            R.id.btEsqueciSenha -> {
                startActivity(Intent(this,EsqueciSenhaActivity::class.java))
            }
            R.id.btCadastrar -> {
                startActivity(Intent(this,CadastroActivity::class.java))
            }
        }
    }
}
