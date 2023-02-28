package com.example.helloandroid.domain

class LoginService {
    fun login(login:String, senha:String): Usuario? {
        if(login == "Ricardo" && senha == "123") {
            return Usuario("Ricardo", "a@a.com")
        } else if (login == "naoto" && senha == "123"){
            return Usuario("naoto","b@b.com")
        }
        return null
    }
}