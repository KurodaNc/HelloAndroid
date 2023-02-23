package com.example.helloandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

//comentario de alteracao 1.1
//comentario do github
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btLogin).setOnClickListener {
            //delega o tratamento para o metodo correto
            onClickLogin()
        }
        findViewById<TextView>(R.id.btEsqueciSenha).setOnClickListener{
            onClickEsqueciSenha()
        }
        findViewById<TextView>(R.id.btCadastrar).setOnClickListener{
            onClickCadastrar()
        }
    }

    //um metodo para cada evento aqui
    private fun onClickLogin() {
        startActivity(Intent(this,HomeActivity::class.java))
    }
    private fun onClickEsqueciSenha() {
        startActivity(Intent(this,EsqueciSenhaActivity::class.java))
    }
    private fun onClickCadastrar(){
        startActivity(Intent(this,CadastroActivity::class.java))
    }
}
