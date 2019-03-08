package lab1.task6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        int number;
        number = sc.nextInt();
        while (number / 100000 < 1 || number / 100000 > 9) {
            System.out.println("wrong number");
            number = sc.nextInt();
        }
        int numb1 = number / 100000;
        int numb2 = ((number % 100000) / 10000);
        int numb3 = (((number % 100000) % 10000) / 1000);
        int numb4 = ((((number % 100000) % 10000) % 1000) / 100);
        int numb5 = (((((number % 100000) % 10000) % 1000) % 100) / 10);  // красота какая
        int numb6 = ((((((number % 100000) % 10000) % 1000) % 100) % 10));
        if (numb1 + numb2 + numb3 == numb4 + numb5 + numb6) {
            System.out.println("your ticket is lucky");
        } else {
            System.out.println("sorry you are unlucky");
        }
    }
}