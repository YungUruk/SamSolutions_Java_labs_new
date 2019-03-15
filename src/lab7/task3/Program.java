package lab7.task3;

public class Program {
    public static void main(String[] args) {
        System.out.println(MathOperator.ADD.execute(23,65));
        System.out.println(MathOperator.SUBSTRACT.execute(12,3));
        System.out.println(MathOperator.MULTIPLY.execute(13,4));
        System.out.println(MathOperator.DIVIDE.execute(12,5));
    }
    public enum MathOperator {
        ADD,
        SUBSTRACT,
        MULTIPLY,
        DIVIDE;
        public double execute(double a, double b){
            switch (this){

                case ADD:
                    return a+b;

                case SUBSTRACT:
                    return a-b;

                case MULTIPLY:
                    return a*b;

                case DIVIDE: return a/b;
                default: return -1;
            }
        }
    }

}
