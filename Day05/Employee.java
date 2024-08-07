package Day05;

import java.time.LocalDate;
import java.time.Period;

public class Employee {

    String name;
    double salary;
    LocalDate hireDate;

    public Employee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public int yearOfService() {
        return Period.between(hireDate, LocalDate.now()).getYears();
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Sukhnandan", 100000, LocalDate.parse("2019-06-15"));

        System.out.println("Name : "+ emp1.name);
        System.out.println("Salary : "+ emp1.salary);
        System.out.println("Hire date : "+ emp1.hireDate);

        System.out.println("Year of service : "+ emp1.yearOfService());

    }
}
