package com.pb.Sinjuchenko.hw2;
import java.util.Scanner;
public class Calculator {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int operand1 = getInt();
        int operand2 = getInt();
        char operation = getOperation();
        int result = calc(operand1,operand2,operation);
        System.out.println("Результат операции: "+result);
    }

    public static int getInt(){
        System.out.println("Введите число:");
        int operand;
        if(scan.hasNextInt()){
            operand = scan.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scan.next();
            operand = getInt();
        }
        return operand;
    }

    public static char getOperation(){
        System.out.println("Введите операцию:");
        char operation;
        if(scan.hasNext()){
            operation = scan.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scan.next();
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int operand1, int operand2, char operation){
        int result;
        switch (operation){
            case '+':
                result = operand1+operand2;
                break;
            case '-':
                result = operand1-operand2;
                break;
            case '*':
                result = operand1*operand2;
                break;
            case '/':
                if(operand2 == 0 ){
                    System.out.println("Деление на ноль запрещено!");
                }else {
                result = operand1/operand2;
                break; }
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(operand1, operand2, getOperation());
        }
        return result;
    }
}