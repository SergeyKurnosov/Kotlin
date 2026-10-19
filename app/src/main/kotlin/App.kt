package org.example.app

import org.example.app.task_1.Book
import org.example.app.task_2.BankAccount
import org.example.app.task_3.User
import org.example.app.task_4.Product


fun main() {

    //////////////////////////////////////////////
    /*
    1.Создай класс Book со свойствами title, author и pages (через основной конструктор) и методом describe(), который печатает:
«Мастер и Маргарита», Михаил Булгаков, 480 стр.
В main создай три книги и вызови describe() у каждой.
    */

    val book1 = Book("book1","author1",10);
    val book2 = Book("book2","author2",20);
    val book3 = Book("book3","author3",30);
    println(book1.describe());//<<book1>>, author1, 10 стр.
    println(book2.describe());//<<book2>>, author2, 20 стр.
    println(book3.describe());//<<book3>>, author3, 30 стр.


    //////////////////////////////////////////////
    /*
    2.Класс BankAccount со свойствами owner (val) и balance (var, начальное значение 0). Методы:
deposit(amount: Int) пополняет счёт;
withdraw(amount: Int) списывает деньги, но если на счёте не хватает, печатает «Недостаточно средств» и баланс не меняет;
printBalance() печатает «Баланс Анны: 1500 руб.».
В main покажи сценарий: пополнить, снять, попробовать снять больше, чем есть
    */
    val ownerAnna = BankAccount("Anna");
    println(ownerAnna.printBalance());// Баланс Anna: 0 руб.
    ownerAnna.deposit(1000);
    println(ownerAnna.printBalance());// Баланс Anna: 1000 руб.
    ownerAnna.withdraw(10000);
    println(ownerAnna.printBalance());// «Недостаточно средств» //Баланс Anna: 1000 руб.



    //////////////////////////////////////////////
    /*
    3.Объяви data class User(val id: Int, val name: String, val email: String) и:
создай двух пользователей с одинаковыми данными и сравни их через == и через ===;
выведи одного через println(user);
сделай копию с другой почтой через copy() и выведи обоих;
разложи пользователя на переменные: val (id, name, email) = user.
    */
    val user_1 = User(1, "user1", email = "user1");
    val user_2 = User(1, "user1", email = "user1");
    println(user_1 == user_2);//true
    println(user_1 === user_2);//false
    println(user_1);//User(id=1, name=user1, email=user1)
    val user_3 = user_1.copy(email = "user3");
    println(user_1 == user_3);//false
    println(user_1 === user_3);//false
    println(user_1);//User(id=1, name=user1, email=user1)
    println(user_3);//User(id=1, name=user1, email=user3)
    val(id,name,email) = user_1;
    println("$id, $name, $email");//1, user1, user1

    //////////////////////////////////////////////
    /*
    4.data class Product(val name: String, val price: Int, val quantity: Int).
Создай три товара в listOf(...).
Посчитай итоговую сумму заказа (price * quantity по каждому товару).
Сделай копию самого дорогого товара с количеством, увеличенным на 1, через copy().
Выведи список в консоль.

    */

    val list_products: List<Product> = listOf(
        Product("product1", 100, 10),
        Product("product2", 200, 20) ,
        Product("product3", 300, 30)
    );
    println(list_products);// [Product(name=product1, price=100, quantity=10), Product(name=product2, price=200, quantity=20), Product(name=product3, price=300, quantity=30)]

    for (product in list_products) {
        println( "Итоговая сумма товара: "+  product.price*product.quantity);
    }
    val max_price_product: Product = list_products.maxBy { it.price };

    val product_copy = max_price_product.copy(quantity = max_price_product.quantity+1);
    println(product_copy);//Product(name=product3, price=300, quantity=31)
}
