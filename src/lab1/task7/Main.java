package lab1.task7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int kol=0;
        while(a>b||a<1||b>9){
            System.out.println("mistake, try 1-9 diapozon");
            a =sc.nextInt();
            b =sc.nextInt();
        }
        int number=b-a+1;
        for (int i=0;i<number;i++){
            for (int j=a;j<b;j++){  // шото надо сделать тут
                System.out.print(a+" ");
                kol++;
                if(a==kol){
                    a=a+1;
                    kol=0;
                    System.out.println("");
                    System.out.print(a+" ");
                }
            }
            //System.out.println(a+" ");
        }
    }
}
