package lab6.task1;


import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args) {
           task1();
        }
        public static void task1() {
            String str[] = new String[3];
            str[0] = "1";
            str[1] = null;
            str[2] = "4";
            for (int i = 0; i < str.length; i++) {
                try {
                    System.out.println(str[i].hashCode());
                }

             catch(NullPointerException e){
                System.out.println("Error");
            }
        }
            }
        }



