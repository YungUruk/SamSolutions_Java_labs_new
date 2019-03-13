package lab5;

import lab5.entities.Employee;
import lab5.entities.JuniorMechanic;
import lab5.entities.Mechanic;
import lab5.entities.Racer;

public class Runner {
    public static void main(String[] args) {
        Employee[] stuff = new Employee[6];
        stuff[0] = new Racer("Name1", 3);
        stuff[1] = new Racer("Name2", 3);
        stuff[2] = new Mechanic("Name3", 10);
        stuff[3] = new Mechanic("Name4", 10);
        stuff[4] = new Mechanic("Name5", 10);
        stuff[5] = new JuniorMechanic("Name6", 5);
        for(Employee person: stuff) {
            System.out.println(person.calculateSalary((int) (10 * Math.random())));
        }
    }
}