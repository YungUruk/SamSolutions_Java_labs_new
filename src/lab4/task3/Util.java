package lab4.task3;

public class Util {
    public static void cheaker(String oString) {
        char[] array=oString.toCharArray();
        int count=0;
        for(int i=0;i<array.length-2;i++){
            if(array[i]==array[i+1]&&array[i+1]==array[i+2]){
                count++;
            }

        }
        System.out.println(count);

    }
}
