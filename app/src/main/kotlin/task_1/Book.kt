package org.example.app.task_1

class Book (val title:String, val author:String, val pages:Int) {


    fun describe():String {
        return "<<$title>>, $author, $pages стр."
    }
}