package lab6.task4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        task4();
    }

    public static void task4() {
        File file = new File("file.txt");
        try(FileReader fileReader = new FileReader(file)) {
            // поток который подключается к текстовому файлу
            BufferedReader bufferedReader = new BufferedReader(fileReader); // соединяем FileReader с BufferedReader

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line); // выводим содержимое файла на экран построчно
                //throw new NullPointerException();
            }
            bufferedReader.close(); // закрываем поток
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("sd");
    }
}
