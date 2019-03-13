package lab5.entities;

public class JuniorMechanic extends Mechanic {

    public JuniorMechanic(String name, double valueOfHour){
        super(name, valueOfHour);
    }

    @Override
    public double calculateSalary(int numberOfHours) {
        double salary = super.calculateSalary(numberOfHours);
        super.getDrunk();
        return salary;
    }
}
