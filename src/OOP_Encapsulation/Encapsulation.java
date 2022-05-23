package OOP_Encapsulation;

public class Encapsulation {
    private String name;

    private double salary;

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            throw new RuntimeException("Name cannot be empty");
        }
        this.name = name;
    }

    public void setSalary(double salary) {


        if (salary <= 0) {
            throw new RuntimeException("Salary cannot be negative or zero");
        }
        this.name = name;
    }
}

