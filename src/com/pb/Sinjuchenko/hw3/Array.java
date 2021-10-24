package com.pb.Sinjuchenko.hw3;
import java.util.Scanner;
import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = input.nextInt();
        int array[] = new int[size];
        int sum = 0;
        int counter = 0;
        boolean isSorted = false;
        int buf;
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print ("Вы ввели следующие элементы:");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]);
        }
        System.out.println();
        System.out.print ("Сумма массива:");
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(" " + sum);
        System.out.print ("Количество положительных элементов:");
        for (int i = 0; i < array.length; i++)
        {
            if(array[i] > 0)
                counter += 1;
        }
        System.out.println(" " + counter);
        System.out.print ("Отсортированный массив:");
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
