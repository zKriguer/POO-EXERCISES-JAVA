package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many employees will be registered? ");
        int employeesNumber = sc.nextInt();

        List<Employee> employeesList = new ArrayList<>();

        for (int i = 1; i <= employeesNumber; i++){
            System.out.println("Employee #" + i + ":");
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            employeesList.add(new Employee(id, name, salary));

        };

        System.out.print("Enter the employee id that will have salary increase: ");
        int employeeIdToIncrease = sc.nextInt();
        System.out.print("Enter the percentage: ");
        double percentageToIncrease = sc.nextDouble();

        Employee employeToIncreaseSalary =
                employeesList.stream().filter(employee -> employee.getId() == employeeIdToIncrease).findFirst().orElse(null);

        if(employeToIncreaseSalary != null) {
            employeToIncreaseSalary.increaseSalary(percentageToIncrease);
        }

        System.out.println("List of employees: ");
        for (Employee emp : employeesList) {
            System.out.println(emp);
        }

        sc.close();
    }
}
