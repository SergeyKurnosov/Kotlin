package org.example.app



fun main() {

    //////////////////////////////////////////////
    /*
    1.Вы делаете мини-форму для кастинга: программа читает три "заявки" с именами. Но люди иногда вводят пробелы или вообще жмут Enter,
    ничего не написав — такие пустые заявки добавлять в список нельзя.

    Создайте пустой MutableList<String> для имён. Прочитайте 3 строки, каждую обработайте через trim().
    Если после trim() строка пустая — пропустите её. Всё непустое добавляйте через add(...). Потом прочитайте ещё одну строку — имя для
    поиска (тоже trim()), и выведите FOUND, если имя есть в списке, иначе NOT FOUND.
   */

//    val names: MutableList<String> = mutableListOf();
//    var input: String?;
//    for (i in 1..3) {
//        println("Input name :")
//        input = readln().trim();
//        if (input == null || input.isEmpty()) {
//            continue;
//        }
//        else{
//            names.add(input);
//        }
//
//    }
//    println(names);
//    println("Find name :")
//    input = readln().trim();
//    if(input in names){
//        println("FOUND");
//    }
//    else{
//        println("NOT FOUND");
//    }

    //////////////////////////////////////////////
    /*
    2.Вы отвечаете за вход на мероприятие. Гости подходят один за другим и называют имя. Иногда кто-то пытается зарегистрироваться
    повторно — и вам нужно это сразу заметить. Множество подходит идеально: в нём один и тот же текст не хранится дважды.

    Сначала прочитайте число guestRequests. Затем guestRequests раз считайте имя и попробуйте добавить его в MutableSet<String>.
    Если add(name) вернул true, выведите REGISTERED, иначе — DUPLICATE. В конце выведите TOTAL: X, где X — количество уникальных гостей.
   */


//    println("Количество : ");
//    val guestRequests = readln().toIntOrNull() ?: return;
//    var input: String?;
//    val names: MutableSet<String> = mutableSetOf();
//    for (i in 1..guestRequests) {
//        println("Input name :");
//        input = readln().trim();
//        if(names.add(input)){
//            println("REGISTERED");
//        }
//        else{
//            println("DUPLICATE");
//        }
//    }
//    println(names);
//    val total:Int = names.size;
//    println("TOTAL: $total");


    //////////////////////////////////////////////
    /*
    3.Вы собираете заказ из двух фруктов в онлайн-магазине. Покупатель вводит два названия, а ваша программа должна быстро
    посчитать сумму. Но есть нюанс: если человек ошибся в названии или такого фрукта нет в прайсе, цена считается 0,
    чтобы программа не падала и не усложняла жизнь кассиру.

    В коде задана карта prices типа Map<String, Int> с товарами "apple" → 70, "banana" → 55, "orange" → 80.
    Прочитайте firstItemName и secondItemName, получите цены через prices[name] (это Int?), замените null на 0 через Elvis ?:, и
    выведите сумму одной строкой.
    */
//    val prices:Map<String, Int> = mapOf("apple" to 70, "banana" to 55, "orange" to 80);
//
//    print("First item name is :");
//    val firstItemName: String = readln().trim();
//    print("Second item name is :");
//    val secondItemName: String = readln().trim();
//
//    val first_price: Int = prices[firstItemName] ?:  0
//    val second_price: Int = prices[secondItemName] ?: 0
//
//    println("Result : " + (first_price + second_price));


}
