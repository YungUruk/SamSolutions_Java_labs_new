package lab3.task2;

import java.util.ArrayList;
import java.util.Scanner;

public class Util {
    public static void formatMoney() {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        int count = money % 10;
        if (count == 1) {
            System.out.println(money + " рубль");
        } else if (count == 2 || count == 3 || count == 4) {
            System.out.println(money + " рубля");
        } else if (count > 4 && count < 10 || count == 0) {
            System.out.println(money + " рублей");
        }
    }

    public static void isLeapYear() {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 4 == 0 || year % 400 == 0) {
            System.out.println("високосный");
        } else {
            System.out.println("не високосный");
        }

    }
    public static <T>ArrayList linearizeArray(T firstArray[][]) {
        ArrayList<T> array = new ArrayList<T>();

        for (int i = 0; i < array.size(); i++) {
            for (int j = 0; j < array.size(); j++) {
                array.add(firstArray[i][j]);
            }
        }
        return array;
    }
}