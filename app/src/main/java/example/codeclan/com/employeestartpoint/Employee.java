package example.codeclan.com.employeestartpoint;

/**
 * Created by user on 28/08/2017.
 */

public class Employee {
    private int empID;
    private String name;
    private String SSN;
    private double salary;

    public Employee(int empID, String name, String SSN, double salary) {
        this.empID = empID;
        this.name = name;
        this.SSN = SSN;
        this.salary = salary;
    }

    public int getEmpID() {
        return empID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public String getSSN() {
        return SSN;
    }

    public double raiseSalary(double raiseAmount) {
        return this.salary += raiseAmount;
    }
}
