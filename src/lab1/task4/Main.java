package lab1.task4;

import java.util.Scanner;

        public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        double depozit = sc.nextDouble();
        double persent = sc.nextDouble();
        System.out.println("number of month = "+persentovochka(depozit,persent));
    }
    public static int persentovochka(double dep, double pers){
        int numb=0;
        double x=0;
        for (double i=dep;i<=(dep*2);i=i+i*(pers/100)){

            numb++;
            x=i+i*(pers/100);
        }
        System.out.println("your money = "+x);
        return numb;
    }
}
