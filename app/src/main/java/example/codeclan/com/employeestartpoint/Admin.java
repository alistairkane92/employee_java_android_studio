package example.codeclan.com.employeestartpoint;

/**
 * Created by user on 24/10/2017.
 */

public class Admin extends Employee {

    public Admin(int empID, String name, String SSN, double salary) {
        super(empID, name, SSN, salary);
    }

    public int getEmpID() {
        return super.getEmpID();
    }

    public String getName() {
        return super.getName();
    }

//    public void setName(String name) {
//        super.getName() = name;
//    }

    public double getSalary() {
        return super.getSalary();
    }

    public String getSSN() {
        return super.getSSN();
    }

    public double raiseSalary(double raiseAmount) {
        return super.raiseSalary(raiseAmount);
    }

}
