package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		Integer number_of_employees = scanner.nextInt();
		
		List<Employee> employees = new ArrayList<>();
		
		for(Integer i = 1; i <= number_of_employees; i++) {
			System.out.printf("Employee #%d.\n", i);
			employees.add(new Employee());
			System.out.println();
		}
		/*Increasing salary*/
		System.out.print("Enter the employee id that will have salary increase: ");
		Integer employee_id = scanner.nextInt();
		Employee found_employee = employees.stream().filter(x -> x.getId().equals(employee_id)).findFirst().orElse(null);
		if(found_employee != null) {
			System.out.print("Enter the percentage:");
			Double percentege = scanner.nextDouble();
			found_employee.increaseSalary(percentege);
		} else{
			System.out.println("This id does not exist!");
		}
		
		
		System.out.println("List of employees:");
		for(Employee employee: employees) {
			System.out.println(employee);
		}
		scanner.close();
	}

}
