package entities;

import java.util.Scanner;

public class Employee {
	private Integer id;
	private String name;
	private Double salary;
	
	public Employee() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Id: ");
		this.setId(scanner.nextInt());
		
		System.out.print("Name: ");
		this.setName(scanner.next());
		scanner.nextLine();
		
		System.out.print("Salary: ");
		this.setSalary(scanner.nextDouble());
	}
	
	public void increaseSalary(Double percentege) {
		this.setSalary(this.getSalary() * (1 + (percentege)/100));
	}
	
	@Override
	public String toString() {
		return this.getId() + ", " + this.getName() + ", " + String.format("%.2f", this.getSalary());
	}
	
	public Integer getId() {
		return id;
	}
	private void setId(Integer id) {
		this.id = id;
	}
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private Double getSalary() {
		return salary;
	}
	private void setSalary(Double salary) {
		this.salary = salary;
	}	
}
