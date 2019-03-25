package lab8.task4;

public class Program {
    public static void main(String[] args) {
        GenericQuickSort printer = new GenericQuickSort();
        String[] people = {"Tom", "Alice", "Sam", "Kate", "Bob", "Helen"};
        Integer[] numbers = {23, 4, 5, 2, 13, 456, 4};
        Double[] numbersDouble={2.1, 3.2, 8.65, 4.56, 1.0};
        printer.<String>print(people);
        printer.<Integer>print(numbers);
        printer.<Double>print(numbersDouble);

    }
}
