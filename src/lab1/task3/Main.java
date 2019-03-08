package lab1.task3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        int number;
        number = sc.nextInt();
        while((number<100)||(number>999)){
            System.out.println("wrong number,try again");
            number = sc.nextInt();
        }
        System.out.println(number);
        int n1,n2,n3;
        n3=number%10;
        n2=(number/10)%10;
        n1=number/100;
        System.out.println(""+n1+n2+n3);
        System.out.println(numberOne(n1)+ " "+numberTwo(n2,n3)+ " " +numberThree(n3,n2));
    }
    public static String numberOne(int numb){
        String sotnya=new String();
        switch (numb){
            case 1:  sotnya="сто";
                break;
            case 2:  sotnya="двести";
                break;
            case 3:  sotnya="триста";
                break;
            case 4:  sotnya="четыреста";
                break;
            case 5:  sotnya="пятьсот";
                break;
            case 6:  sotnya="шестьсот";
                break;
            case 7:  sotnya="семьсот";
                break;
            case 8:  sotnya="восемьсот";
                break;
            case 9:  sotnya="девятьсот";
                break;
        }
        return sotnya;
    }
    public static String numberThree(int numb,int n2){
        String sotnya=new String();
        if(n2==1){
            sotnya=" ";
        }
        else {
            switch (numb) {
                case 0:
                    sotnya = " ";
                    break;
                case 1:
                    sotnya = "один";
                    break;
                case 2:
                    sotnya = "два";
                    break;
                case 3:
                    sotnya = "три";
                    break;
                case 4:
                    sotnya = "четыре";
                    break;
                case 5:
                    sotnya = "пять";
                    break;
                case 6:
                    sotnya = "шесть";
                    break;
                case 7:
                    sotnya = "семь";
                    break;
                case 8:
                    sotnya = "восемь";
                    break;
                case 9:
                    sotnya = "девять";
                    break;
            }
        }
        return sotnya;
    }
    public static String numberTwo(int numb, int n3){
        String sotnya=new String();
        switch (numb){
            case 1: switch(n3){
                case 0: sotnya="десять";
                    break;
                case 1: sotnya="одинадцать";
                    break;
                case 2: sotnya="двенадцать";
                    break;
                case 3: sotnya="тринадцать";
                    break;
                case 4: sotnya="четырнадцать";
                    break;
                case 5: sotnya="пятнадцать";
                    break;
                case 6: sotnya="шестнадцать";
                    break;
                case 7: sotnya="семьнадцать";
                    break;
                case 8: sotnya="восемьнадцать";
                    break;
                case 9: sotnya="девятнадцать";
                    break;
            }
                break;
            case 2:  sotnya="двадцать";
                break;
            case 3:  sotnya="тридцать";
                break;
            case 4:  sotnya="сорок";
                break;
            case 5:  sotnya="пятьдесят";
                break;
            case 6:  sotnya="шестьдесят";
                break;
            case 7:  sotnya="семьдесят";
                break;
            case 8:  sotnya="восемьдесят";
                break;
            case 9:  sotnya="девяносто";
                break;
        }
        return sotnya;
    }
}
