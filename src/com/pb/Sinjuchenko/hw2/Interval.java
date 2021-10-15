package com.pb.Sinjuchenko.hw2;
import java.util.Scanner;
public class Interval {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        int num;
        num = scan.nextInt();
        if(0 <= num && num<= 14 ){
            System.out.println("Число находится в провежутке  [0 -14]");
        } else if(15 <= num && num<= 35 ){
            System.out.println("Число находится в провежутке  [15 -35]");
        }
          else if(36 <= num && num<= 50 ){
            System.out.println("Число находится в провежутке  [36 -50]");
        }
          else if(51 <= num && num<= 100 ){
            System.out.println("Число находится в провежутке  [51 -100]");
        } else {System.out.println("Число не соответствует заданным интервалам");}
    }
}
