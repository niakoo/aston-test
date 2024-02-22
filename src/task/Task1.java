package task;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое целое число (a): ");
        int a = sc.nextInt();
        System.out.print("Введите второе целое число (b): ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("a > b");
        } if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        int sum = a + b;
        int difference = a - b;
        int division = a / b;
        int multiplication = a * b;

        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);
        System.out.println("Деление: " + division);
        System.out.println("Умножение: " + multiplication);

        sc.close();
    }
}