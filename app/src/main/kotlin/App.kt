package org.example.app

import org.example.utils.Printer
import java.util.Locale
import java.util.Locale.getDefault
import java.util.stream.Collectors

fun parseCountOrNull(text: String): Int?{
    val trim_text: String = text.trim();
    if (trim_text.isEmpty()) return null
    else return  trim_text.toIntOrNull();
}

fun parseIntOrNull(text: String): Int?{
    val trim_text: String = text.trim();
    if (trim_text.isEmpty()) return null
    else return  trim_text.toIntOrNull();
}

fun formatText(text: String, trimSpaces: Boolean = true, uppercase: Boolean = false, repeatCount: Int = 1, separator: Char = ' '): String{
    var result = text;
    if (trimSpaces)result = result.trim();
    if (uppercase)result = result.uppercase(getDefault());

    if(repeatCount > 0){
        var local_res: String = result;
        for(i in 0 until repeatCount){
           local_res += separator +result;
        }
        result = local_res;
    }

    return result;

}


fun main() {

    //////////////////////////////////////////////
    /*
    1.Вы делаете маленький модуль для склада: оператор вводит "сколько коробок приехало", но иногда он отправляет пустую строку
    (не успел, передумал, нажал Enter), а иногда вводит мусор вроде ten.
    Вам нужна функция parseCountOrNull(text: String): Int?, которая берёт строку, приводит её в порядок через trim(), и
    дальше действует строго: если после trim() пусто — это “значение отсутствует”, то есть null. Если строка не пустая — пробуем
    распарсить число через toIntOrNull(). В main вы читаете ввод, вызываете эту функцию и показываете результат одной строкой,
    чтобы сразу было понятно: получилось число или null.
    */
//    println("сколько коробок приехало ? : ");
//    var input = readln();
//    val result: String = parseCountOrNull(input).toString()
//    println("приехало : $result");

    //////////////////////////////////////////////
    /*
    2.Вы помогаете музею настроить терминал продажи билетов. Посетитель вводит возраст, а программа должна либо назвать цену,
    либо остановить операцию и объяснить ошибку (если возраст не распознан или оказался отрицательным).
    Программа читает строку возраста, делает trim() и парсит через toIntOrNull(). Если возраст не распарсился, нужно вывести ошибку и
    сразу выйти из main (никаких дальнейших сравнений). Если распарсился — выбрать нужную ветку через if / else if / else по диапазонам и
    вывести ровно одну строку результата.
    */
//    println("возраст ? : ");
//    var input = readln();
//    val result:Int? = parseCountOrNull(input);
//    if(result == null){
//        println("возраст не распознан");
//        return;
//    }
//    else if(result < 0){
//        println("возраст оказался отрицательным");
//        return;
//    }
//    else if(result in 0..10){
//        println("Цена 10$");
//    }
//    else if(result in 11..21){
//        println("Цена 20$");
//    }
//    else if(result in 22..200){
//        println("Цена 30$");
//    }



    //////////////////////////////////////////////
    /*
    3.Вы делаете маленький «генератор текста» для консольного чат-бота. Иногда текст нужно подчистить от пробелов по краям, иногда — крикнуть
    капсом, а иногда — повторить фразу несколько раз через разделитель (например, чтобы сделать декоративную строку).
    Напишите функцию
    formatText(text: String, trimSpaces: Boolean = true, uppercase: Boolean = false, repeatCount: Int = 1, separator: Char = ' '): String.
    Функция должна:
    при trimSpaces = true убрать пробелы по краям,
    при uppercase = true перевести строку в верхний регистр,
    склеить repeatCount копий строки через separator.
    В main нужно вывести результаты четырёх вызовов: только с обязательным text; с изменённым только separator; с изменённым только repeatCount;
    с изменёнными uppercase и separator при неизменном trimSpaces. Вызовы должны демонстрировать именованные аргументы и пропуск части
    параметров с дефолтами.
    */

    val res_1:String = formatText("Hello_World");
    println(res_1);

    val res_2:String = formatText("Hello_World",separator = '+');
    println(res_2);

    val res_3:String = formatText("Hello_World", repeatCount = 3);
    println(res_3);

    val res_4:String = formatText("Hello_World",uppercase = true, separator = '-');
    println(res_4);
}
