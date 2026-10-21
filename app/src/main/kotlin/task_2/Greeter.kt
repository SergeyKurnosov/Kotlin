package org.example.app.task_2

class Greeter {

    lateinit var userName: String

    fun init(name: String){
        require(name.isNotBlank()) { "Name cannot be blank" }
        userName = name.trim()
    }

    fun greet(): String{
        return "Hello $userName !";
    }

}