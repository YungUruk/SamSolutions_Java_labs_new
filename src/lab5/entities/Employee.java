package lab5.entities;

abstract public class Employee {
    public static final int TAX_PERCENT = 13;
    protected String name;


    Employee(String name) {
        this.name = name;
    }

    abstract public double calculateSalary(int numberOfUnits);

    protected double calculateTax(double salaryWithoutTax){
        return salaryWithoutTax * TAX_PERCENT / 100;
    }

    public void displayName() {
        System.out.println(name);
    }

    public void setName(String name) {
        this.name = name;
    }

}
