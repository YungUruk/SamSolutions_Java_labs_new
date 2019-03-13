package lab6.task2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        task2();
    }

    public static void task2() throws IOException {
        FileInputStream fis = null;
        try {

            fis = new FileInputStream("C:\\test.txt");
            fis.read();
            System.out.println("132");

        } catch (FileNotFoundException exception) {
            System.out.println("not find file");
        } catch (IOException exeption) {
            System.out.println("null value");
        }
        finally {
            fis.close();
        }
    }
}
