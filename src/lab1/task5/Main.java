package lab1.task5;

import java.util.Scanner;

import static java.lang.Double.POSITIVE_INFINITY;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc= new Scanner(System.in);
        double mid=0.0,kol=0.0,sum=0.0;
        for(int i=0;i<POSITIVE_INFINITY;i++){
            int number=sc.nextInt();
            kol++;
            sum=sum+number;
            if(number<0||number>9){
                System.out.println("mistake! only 1-9 diapozon");
                break;
            }
            if(number==0){
                System.out.println(" number of numbers= "+kol);
                System.out.println("sum= "+sum);
                System.out.println("middle= "+(sum/kol));
                break;
            }
        }
    }
}
