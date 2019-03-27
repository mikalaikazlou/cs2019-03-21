package by.it.kozlov._tasks_.lesson02;

import java.util.Scanner;

/*
Ускорение свободного падения на Земле и Марсе таково:
Марс   3.86
Земля   9.81

С клавиатуры вводится вес человека в килограммах.
Рассчитайте вес человека на Марсе и выведите
округлив его до сотых килограмма (2 знака)

Создайте для этих целей метод getWeight(int weight)

Требования:
1. Метод getWeight(int weight) должен быть статическим.
2. Метод getWeight должен возвращать значение типа double.
3. Метод getWeight должен обязательно (!) округлять до сотых возвращаемое значение типа double.
4. Метод getWeight не должен ничего выводить на экран.
5. Метод getWeight должен правильно переводить вес тела в килограммах на Земле
    в вес этого же тела на Марсе, и возвращать это значение.

Пример:

Ввод:
75

Вывод:
29.51


*/

class TaskC3 {
    static class getWeight{
    public static void main (String[]args){
        System.out.println("Ввод:");
        Scanner sn = new Scanner(System.in);
        int a = sn.nextInt();
       int i = a * 386*100 / 981;
        double v= (double) i/100;
        System.out.println("Вывод\n" + v);
        }
    }
    }
 /*
    class getWeight {
    static void getWeight (int weight){
            double getWeight;
            System.out.println("Ввод:");
            Scanner sn = new Scanner(System.in);
            int a = sn.nextInt();
            getWeight = (int) a * 3.86 * 100.0 / 9.81;
            double v = getWeight / 100.0;
            System.out.println("Вывод\n" + v);
        }
    }
*/