package lab5.entities;

public class Mechanic extends Employee {
    protected double valueOfHour;

    public Mechanic(String name, double valueOfHour){
        super(name);
        this.valueOfHour = valueOfHour;
    }

    @Override
    public double calculateSalary(int numberOfHours) {
        double salaryWithoutTax = valueOfHour*numberOfHours;
        return salaryWithoutTax - calculateTax(salaryWithoutTax);
    }

    public void getDrunk(){
        System.out.println("I'm drunk!");
    }
}
