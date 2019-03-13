package lab6.task3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        task2();
    }

    public static void task2(){
        try {
            FileInputStream fis = null;
            fis = new FileInputStream("C:\\test.txt");
            fis.read();
            System.out.println("132");

        }
        catch(Exception exception){
            System.out.println("some mistake");
        }
    }
}
