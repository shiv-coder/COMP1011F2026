/*
 * Advanced OOP Java
 * Lab: Polymorphic Payroll System
 *
 * Practice:
 * - Abstract classes
 * - Inheritance
 * - Method overriding
 * - Runtime polymorphism
 */
 
abstract class Employee {
 
    private String name;
 
    // Constructor
    public Employee(String name) {
        // TODO: initialize name
        this.name = name;
    }
 
    // Getter
    public String getName() {
        // TODO: return name
        return name;
    }
 
    // Abstract method
    public abstract double earnings();
 
    @Override
    public String toString() {
        // TODO: return employee information
        return "Employee: " + name;
    }
}
 
 
// Subclass 1
class CommissionEmployee extends Employee {
 
    private double sales;
    private double rate;
 
    public CommissionEmployee(String name, double sales, double rate) {
        super(name);
        // TODO: call superclass constructor
        this.sales = sales;
        // TODO: initialize sales and rate
        this.rate = rate;
 
        
    }
 
    @Override
    public double earnings() {
        // TODO: calculate commission earnings
        return sales * rate;
    }
 
    @Override
    public String toString() {
        // TODO: add commission employee information
        return super.toString() + "\nCommission Earnings : $" + earnings();
    }
}
 
 
// Subclass 2
class BasePlusCommissionEmployee extends CommissionEmployee {
 
    private double baseSalary;
 
    public BasePlusCommissionEmployee(
            String name,
            double sales,
            double rate,
            double baseSalary) {
 
        // TODO: call superclass constructor
        super(name, sales, rate);
         
        // TODO: initialize baseSalary
        this.baseSalary = baseSalary;
    }
 
    @Override
    public double earnings() {
        // TODO: calculate base salary + commission
        return baseSalary + super.earnings();
    }
 
    @Override
    public String toString() {
        // TODO: add base salary information
        return super.toString()
                + "\nBase Salary: $" + baseSalary
                + "\nTotal Earnings: $" + earnings();
    }
}
 
 
// Driver Class
public class PayrollSystemDemo {
 
    public static void main(String[] args) {
 
        // TODO: Create an Employee array
        Employee[] employees ={
            new CommissionEmployee("Sarah",5000,0.10),
            new BasePlusCommissionEmployee("John", 2000, 0.10, 1000)
        };
 
         
        // TODO: Use a loop to display
        // employee information
        // and earnings
        for(Employee e: employees){
            System.out.println(e);
            System.out.println("---------------------");
        }
 
    }
}
 
 