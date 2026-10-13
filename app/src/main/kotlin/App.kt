package org.example.app

import org.example.utils.Printer
import java.util.stream.Collectors

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    //////////////////////////////////////////////
    /*
    1.Простая: «Касса»
Пользователь вводит количество товаров n, затем n цен. Цены хранятся в IntArray.
Выведи чек, где каждая строка выглядит так: 1. 120 ₽. Нумерация с 1, а индексы в массиве с 0.
Выведи итого и самую дорогую позицию с её номером в чеке.
Условие: var только там, где значение реально меняется (сумма, максимум). Всё остальное val.
     */

//    val n_count = readln().toInt();
//    val prices: Array<Double> = Array(n_count) { 0.0 };
//    for (i in 0 until n_count)
//    prices[i] = readln().toDouble();
//    var sum = 0.0;
//    var max = 0.0;
//
//    for (i in 1..n_count){
//        println("$i.  ${prices[i-1]}");
//        sum += prices[i-1];
//    }
//    println(sum);
//    max = prices.max()!!;
//    println(max);


    //////////////////////////////////////////////
    /*
    2.В зале один ряд из 10 мест, это BooleanArray(10). Пользователь вводит номера мест (1-10), пока не введёт 0.
Перед каждым вводом выведи зал: свободное место как [ ], занятое как [X]. Под местами печатай номера.
Номер вне диапазона проверяй через in 1..10. Если место занято или номера нет, пиши понятное сообщение, но не падает
После выхода из цикла покажи, сколько мест занято, и перечисли свободные через step. Например, сначала нечётные, потом чётные.
Массив объяви через val. Не спеши «исправлять» это на var: пусть студент сам поймёт, почему val seats не мешает менять seats[3] = true.
     */
//    val row:Array<Boolean> = Array(10){false};
//    var num:Int;
//    do {
//        for(i in 0..<10){
//            print(if (row[i]) "[X]" else "[ ]");
//        }
//        println();
//        for(i in 1..10){
//            print(" $i ");
//        }
//        println();
//        num = readln().toInt()
//        if(num in 1..10){
//            if(!row[num-1]){
//                row[num-1] = true;
//            }else{
//                println("Место занято")
//            }
//        }else{
//            println("такого номера нет");
//        }
//
//    }while (num != 0 );
//
//    println("занято - "+  row.count { r->r==true })
//
//
//    for(i in 0..<10 step 2){
//        print( if(!row[i]) i+1 else "");
//    }
//    println();
//    for(i in 1..<10 step 2){
//        print( if(!row[i]) i+1 else "");
//    }


    //////////////////////////////////////////////
    /*
    3.Пользователь вводит числа одной строкой через пробел (readln().split(" "), затем преобразование в IntArray), потом число k.
Найди подмассив из k подряд идущих элементов с максимальной суммой. Выведи сумму и стартовый индекс.
Диапазон начала окна считай аккуратно, чтобы не получить ArrayIndexOutOfBounds.
Затем разверни массив на месте, без reversed() и без второго массива: for (i in 0 until size / 2) и обмен элементов.
Валидация: если k больше размера или меньше 1, выведи сообщение и завершись.
Правило: всё val, кроме тех переменных, которым действительно нужно меняться. Это можно проверить по подсказкам IDEA.
     */

    val numbers = readln()
        .trim()
        .split(Regex("\\s+"))
        .map { it.toInt() }
        .toIntArray()

    val k = readln().trim().toInt()
    if(k > numbers.size || k < 0) {
        println("ERROR")
        return;
    }

    var currentSum = 0
    for (i in 0 until k) {
        currentSum += numbers[i]
    }

    var maxSum = currentSum
    var startIndex = 0

    for (i in k until numbers.size) {
        currentSum += numbers[i] - numbers[i - k]

        if (currentSum > maxSum) {
            maxSum = currentSum
            startIndex = i - k + 1
        }
    }

    println(maxSum)
    println(startIndex)

    for (i in 0 until numbers.size / 2){
        val temp = numbers[i];
        numbers[i] = numbers[(numbers.size-1) - i];
        numbers[(numbers.size-1) - i] = temp;
    }
    println(numbers.joinToString(" "));

}

fun collect(supplier: Any) {}
