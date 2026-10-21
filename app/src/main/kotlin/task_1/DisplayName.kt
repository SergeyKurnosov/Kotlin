package org.example.app.task_1

class DisplayName {
     var name: String = ""
         set(value) {
             if (value.trim().isEmpty()) {
                 field = "Unknown"
             }
             else{
                 field = value.trim()
             }

         }



}
