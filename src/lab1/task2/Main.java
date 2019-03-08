package lab1.task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc =new Scanner(System.in);
        System.out.println("input x1,y1");
        double koordX1 = sc.nextDouble();     //извращение какое-то
        double koordY1 = sc.nextDouble();
        System.out.println("input x2,y2");
        double koordX2 = sc.nextDouble();
        double koordY2 = sc.nextDouble();
        System.out.println("input x3,y3");
        double koordX3 = sc.nextDouble();
        double koordY3 = sc.nextDouble();
        double d1=dlinna(koordX1,koordY1,koordX2,koordY2);
        double d2=dlinna(koordX2,koordY2,koordX3,koordY3);
        double d3=dlinna(koordX3,koordY3,koordX1,koordY1);
        double perimetr = d1+d2+d3;
        System.out.println(perimetr);
        double halfPerimetr=perimetr/2;
        double square=Math.sqrt(Math.abs((halfPerimetr*(halfPerimetr-d1)*(halfPerimetr-d2)*(halfPerimetr-d3))));
        System.out.println(square); // это не код это земля мне пухом кароч;

    }
    public static double dlinna(double x1, double y1,double x2, double y2){
        double dlinna=Math.sqrt(Math.abs((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2))));
        return dlinna;
    }

}