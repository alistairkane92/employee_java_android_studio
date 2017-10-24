package example.codeclan.com.employeestartpoint;

/**
 * Created by user on 24/10/2017.
 */

public class Manager extends Employee {
    public String deptName;

    public Manager(int empID, String name, String SSN, double salary, String deptName) {
        super(empID, name, SSN, salary);
        this.deptName = deptName;
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

    public String getDeptName() {
        return this.deptName;
    }

    public double raiseSalary(double raiseAmount) {
        return super.raiseSalary(raiseAmount);
    }
}
