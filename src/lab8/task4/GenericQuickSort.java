package lab8.task4;


import java.util.Arrays;


public class GenericQuickSort {



    public <T> void print(T[] items){
        for(T item: items){
            System.out.print(item+", ");
        }
        System.out.print("sort: ");
        Arrays.sort(items);
        System.out.println(Arrays.toString(items));
    }



    }

