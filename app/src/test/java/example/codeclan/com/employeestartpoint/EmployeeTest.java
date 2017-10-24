package example.codeclan.com.employeestartpoint;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by sandy on 13/10/2017.
 */

public class EmployeeTest {
    Employee employee;
    Manager manager;
    Engineer engineer;
    Admin admin;
    Director director;

    @Before
    public void before() {
        employee = new Employee(0, "Bob Dole", "ABC123", 0);
        manager = new Manager(0, "John Dole", "CBA321", 0, "Home Dept");
        engineer = new Engineer(0, "James Dole", "DEF456", 0);
        admin = new Admin(0, "Adam Dole", "FED654", 0);
        director = new Director(0, "Michael Dole", "GHI789", 0, "Kidz Ware", 5000);
    }

    @Test
    public void EmployeeTestGetters() {
        assertEquals(0, employee.getEmpID());
        assertEquals("Bob Dole", employee.getName());
        assertEquals("ABC123", employee.getSSN());
        assertEquals(0, employee.getSalary(), 0.01);
    }

    @Test
    public void EmployeeRaiseSalary() {
        employee.raiseSalary(50);
        assertEquals(50, employee.getSalary(), 0.01);
    }

    @Test
    public void ManagerTestGetters() {
        assertEquals(0, manager.getEmpID());
        assertEquals("John Dole", manager.getName());
        assertEquals("CBA123", manager.getSSN());
        assertEquals(0, manager.getSalary(), 0.01);
        assertEquals("Home Dept", manager.getDeptName());
    }

    @Test
    public void ManagerRaiseSalary() {
        manager.raiseSalary(50);
        assertEquals(50, manager.getSalary(), 0.01);
    }

    @Test
    public void EngineerTestGetters() {
        assertEquals(0, engineer.getEmpID());
        assertEquals("James Dole", engineer.getName());
        assertEquals("DEF456", engineer.getSSN());
        assertEquals(0, engineer.getSalary(), 0.01);
    }

    @Test
    public void EngineerRaiseSalary() {
        engineer.raiseSalary(50);
        assertEquals(50, engineer.getSalary(), 0.01);
    }

    @Test
    public void AdminTestGetters() {
        assertEquals(0, admin.getEmpID());
        assertEquals("Adam Dole", admin.getName());
        assertEquals("FED654", admin.getSSN());
        assertEquals(0, admin.getSalary(), 0.01);
    }

    @Test
    public void AdminRaiseSalary() {
        admin.raiseSalary(50);
        assertEquals(50, admin.getSalary(), 0.01);
    }

    @Test
    public void DirectorTestGetters() {
        assertEquals(0, director.getEmpID());
        assertEquals("Michael Dole", director.getName());
        assertEquals("GHI789", director.getSSN());
        assertEquals(0, director.getSalary(), 0.01);
        assertEquals("Kidz Ware", manager.getDeptName());
        assertEquals(5000, director.getBudget(), 0.01);
    }

    @Test
    public void DirectorRaiseSalary() {
        director.raiseSalary(50);
        assertEquals(50, director.getSalary(), 0.01);
    }
}
