package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class ProgramCopy {
    /* Пусть дан произвольный список целых чисел.
     1) Нужно удалить из него чётные числа
     2) Найти минимальное значение
     3) Найти максимальное значение
     4) Найти среднее значение*/
    public static void main(String[] args) {

        ArrayList<Integer> listInt = new ArrayList<>();
        int numberStart = input("Введите начальное число для заполнения списка: ");
        int numberEnd = input("Введите конечное число для заполнения списка: ");
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            listInt.add(new Random().nextInt(numberStart, numberEnd));
        }
        System.out.println("Начальный список чисел: ");
        System.out.println(listInt);

        listInt.sort((o1, o2) -> o1 - o2);
        System.out.println("Минимальное значение в списке: " +listInt.get(0));
        System.out.println("Максимальное значение в списке: " +listInt.get(listInt.size()-1));

        Iterator <Integer> iterator1 = listInt.iterator();
        while (iterator1.hasNext()){
            int item = iterator1.next();
            sum += item;
        }
        int average = sum/listInt.size();
        System.out.println("Среднее арифметическое списка = " + average);

        Iterator<Integer> iterator = listInt.iterator();
        while (iterator.hasNext()){
            int item = iterator.next();
            if (item % 2 == 0){
                iterator.remove();
            }
        }
        System.out.println("Список с нечетными элементами: ");
        System.out.println(listInt);

    }

    static int input(String message){
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        int number = in.nextInt();
        return number;
    }
}
