package lab4.task1;

public class Util {
    public static void insert(String oString) {
        double num=0,palin=0;
        String[] strArray =oString.split(" ");
        StringBuilder builder;
        for(String i:strArray){
            num++;
            builder =new StringBuilder(i);


            if(i.equals(builder.reverse().toString())){
                palin++;
            }

        }
        double pers=((palin/num)*100);
        System.out.print("slov palin...- "+palin+" persent of palin..= "+pers);    }
}
