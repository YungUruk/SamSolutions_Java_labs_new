package lab5.entities;

public class Racer extends Employee {
    protected double valueOfRace;

    public Racer(String name, double valueOfRace){
        super(name);
        this.valueOfRace = valueOfRace;
    }

    @Override
    public double calculateSalary(int numberOfRaces) {
        double salaryWithoutTax = numberOfRaces*valueOfRace;
        return salaryWithoutTax - calculateTax(salaryWithoutTax);
    }

}
