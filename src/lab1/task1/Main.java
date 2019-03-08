package lab1.task1;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc=new Scanner(System.in);
        double tf=sc.nextDouble();
        System.out.println("temperature in Farengate = " + tf);
        double tc=(((tf-1)*5)/9);
        System.out.println("temperature in Celsium = " + tc);
    }
}
