package lab3.task1;

import java.util.Arrays;


public class Belarus {

    public static void main(String[] args) {
        System.out.println("Hello World!");


    }
    public static final String CAPITAL = "Minsk";
    public static final String MONEY="BYN";
    public static final String DATE_OF_CREATION="25.08.1991";
    public enum LANGUAGE{RUSSIAN,BELARUSSIAN}
    public enum NEIGHBOARDS{RUSSIA,UKRAINE,POLAND,LIETUVA}
    public enum DISTRICTS{GOMEL,GRODNO,VITEBSK,BREST,MOGILEV}


    public static void shortinfo(){
        System.out.println("the capital of belarus  is  " +CAPITAL);
        System.out.println("Date of belarus creation  " +DATE_OF_CREATION);
        System.out.println("Language in belarus is  " + LANGUAGE.BELARUSSIAN+", "+ LANGUAGE.RUSSIAN);
    }
    public static void fullinfo(){
        System.out.println("the capital of belarus  is  " +CAPITAL);
        System.out.println("Date of belarus creation  " +DATE_OF_CREATION);
        System.out.println("Language in belarus is  " + LANGUAGE.BELARUSSIAN+", "+ LANGUAGE.RUSSIAN);
        System.out.println("Money in belarus used "+MONEY);
        System.out.println("Belarus neighboards "+ Arrays.asList(NEIGHBOARDS.values()));
        System.out.println("Belarus districts "+Arrays.asList(DISTRICTS.values()));


    }
}
