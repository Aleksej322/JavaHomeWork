package com.pb.Sinjuchenko.hw3;

import java.util.Scanner;
import java.lang.Math;
public class Bingo {
    public static void main(String[] args) {
        int Number_unknown, Number_user, Trys = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Угадайте число от 0 до 100. Для выхода введите '-1'");
        Number_unknown = (int)Math.floor(Math.random() * 100);
        do {
            Trys++;
            System.out.print("Введите число: ");
            Number_user = input.nextInt();
            if (Number_user > Number_unknown)
                System.out.println("Число меньше.");
            else if (Number_user == -1 )
            {
                System.out.println("Досрочный выход");
                break;
            }
            else if (Number_user < Number_unknown) {
                System.out.println("Число больше.");
            }
            else System.out.println("Вы угадали!");
        } while (Number_user != Number_unknown);
        System.out.println("Количество попыток: " + Trys);
    }
}
