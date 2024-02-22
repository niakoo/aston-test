package task;


import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первую строку (a): ");
        String a = sc.nextLine();
        System.out.print("Введите вторую строку (b): ");
        String b = sc.nextLine();

        if (a.equals(b)) {
            System.out.print("Строки идентичны");
        } else {
            System.out.print("Строки не идентичны");
        }
    }
}