package com.example.helloandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log //import do log
import android.widget.Button
import android.widget.TextView
import com.example.helloandroid.domain.LoginService
import com.example.helloandroid.extension.Activity.alert

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
        //encontrar as views
        val tLogin = findViewById<TextView>(R.id.tLogin)
        val tSenha = findViewById<TextView>(R.id.tSenha)
        //le os textos
        val login = tLogin.text.toString()
        val senha = tSenha.text.toString()
        Log.d("[Aula4-Prog]","Login: $login, senha: $senha")
        val service = LoginService()
        val user = service.login(login,senha)
        if(user != null) {
            //login ok, vai para Home
            startActivity(Intent(this,HomeActivity::class.java))
        } else {
            //erro de login
            alert(msg = "Login incorreto, digite os dados novamente")
        }

    }

    private fun onClickEsqueciSenha() {
        startActivity(Intent(this,EsqueciSenhaActivity::class.java))
    }
    private fun onClickCadastrar(){
        startActivity(Intent(this,CadastroActivity::class.java))
    }
}
