package org.example.app.task_2

class BankAccount (val owner: String, var balance: Int = 0) {
    fun deposit(amount: Int) { if ( amount > 0) balance += amount; }
    fun withdraw(amount: Int) {
        if ( amount > balance) {
            println("«Недостаточно средств»");
        }
        else{
            balance -= amount;
        }
    }
    fun printBalance():String {
        return "Баланс $owner: $balance руб.";
    }
}