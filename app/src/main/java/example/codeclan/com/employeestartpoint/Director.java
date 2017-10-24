package example.codeclan.com.employeestartpoint;

/**
 * Created by user on 24/10/2017.
 */

public class Director extends Manager {
    public double budget;

    public Director(int empID, String name, String SSN, double salary, String deptName, double budget) {
        super(empID, name, SSN, salary, deptName);
        this.budget = budget;
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
        return super.getDeptName();
    }

    public double getBudget() {
        return budget;
    }

    public double raiseSalary(double raiseAmount) {
        return super.raiseSalary(raiseAmount);
    }

}
