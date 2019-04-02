package by.it.kozlov.lesson04;

import java.util.Scanner;

/*
Напишите программу которая спрашивает у пользователя:
Какую вы хотите зарплату в $$$?

После ввода суммы, программа анализирует полученное значение
и если введенная цифра меньше 300 или больше 3000 программа выводит на экран:
Мы вам перезвоним!

Иначе выводит в цикле по переменной int month от 0 до 14 рассчитанную зарплату.
В летние месяцы - выводится введенная сумма с названием месяца.
В несуществующие месяцы 0, 13 и 14 выводится сумма в $0.0
в остальные месяцы выводится указанная сумма с премией в 50%.

Сделайте так, чтобы в тот месяц, когда получилась зарплата в $666 цикл после вывода прерывался.

Пример работы программы (у вас должно быть так же, до символа):

Какую вы хотите зарплату в $$$?
2000
За месяц 0 начислено $0.0
За январь начислено $3000.0
За февраль начислено $3000.0
За март начислено $3000.0
За апрель начислено $3000.0
За май начислено $3000.0
За июнь начислено $2000.0
За июль начислено $2000.0
За август начислено $2000.0
За сентябрь начислено $3000.0
За октябрь начислено $3000.0
За ноябрь начислено $3000.0
За декабрь начислено $3000.0
За месяц 13 начислено $0.0
За месяц 14 начислено $0.0

*/
public class TaskC1 {
    public static void main(String[] args) {
        System.out.println("Какую вы хотите зарплату в $$$?");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int month;
        if (a<300 || a>3000){
            System.out.println("Мы вам перезвоним!");
            }
else {
        for (month=0;month<=14;month++){
            switch (month){
                case 0:
                    System.out.println("За месяц 0 начислено $0.0");
                    break;
                case 1:
                    double zp1=(int)a+(((int)a*50)/100);
                    if (zp1==666){
                        break; }
                    System.out.println("За январь начислено $"+zp1);
                    break;

                case 2:
                    double zp2=(int)a+(((int)a*50)/100);
                    if (zp2==666){
                        break; }
                    System.out.println("За февраль начислено $"+zp2);
                    break;

                case 3:
                    double zp3=(int)a+(((int)a*50)/100);
                    if (zp3==666){
                        break; }
                    System.out.println("За март начислено $"+zp3);
                    break;

                case 4:
                    double zp4=(int)a+(((int)a*50)/100);
                    if (zp4==666|| a==666){
                        break; }
                    System.out.println("За апрель начислено $"+zp4);
                    break;

                case 5:
                    double zp5=(int)a+(((int)a*50)/100);
                    if (zp5==666){
                        break; }
                    System.out.println("За май начислено $"+zp5);
                    break;

                case 6:
                    double zp6=a;
                    if (a==666){
                        break; }
                    System.out.println("За июнь начислено $"+zp6);
                    break;

                case 7:
                    double zp7=a;
                    if (a==666){
                        break; }
                    System.out.println("За юль начислено $"+zp7);
                    break;

                case 8:
                    double zp8=a;
                    if (a==666){
                        break; }
                    System.out.println("За август начислено $"+zp8);
                    break;
                case 9:
                    double zp9=(int)a+(((int)a*50)/100);
                    if (zp9==666|| a==666){
                        break; }
                    System.out.println("За сентябрь начислено $"+zp9);
                    break;
                case 10:
                    double zp10=(int)a+(((int)a*50)/100);
                    if (zp10==666|| a==666){
                        break; }
                    System.out.println("За октябрь начислено $"+zp10);
                    break;
                case 11:
                    double zp11=(int)a+(((int)a*50)/100);
                    if (zp11==666|| a==666){
                        break; }
                    System.out.println("За ноябрь начислено $"+zp11);
                    break;
                case 12:
                    double zp12=(int)a+(((int)a*50)/100);
                    if (zp12==666|| a==666){
                        break; }
                    System.out.println("За декабрь начислено $"+zp12);
                    break;
                case 13:
                    System.out.println("За месяц 13 начислено $0.0");
                    break;
                case 14:
                    System.out.println("За месяц 14 начислено $0.0");
                    break;


        }}}}}