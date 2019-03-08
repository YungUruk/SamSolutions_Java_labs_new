package lab4.task2;

public class Util {
    public static void insert(String oString) {

        String strArray = oString.replaceAll(" ", "");
        StringBuilder builder;
        builder = new StringBuilder(strArray);
        if (strArray.equals(builder.reverse().toString())) {
            System.out.println("equal reading");
        } else {
            System.out.println("non equal reading");
        }
    }
}