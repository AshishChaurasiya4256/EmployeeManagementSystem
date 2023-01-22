package EmployeeManagement;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class EmployeeService {

	HashSet<Employee> empset = new HashSet<>();
	
	Employee emp1 = new Employee(101,"Shital",24,"Developer","IT",25000);
	Employee emp2 = new Employee(102,"Meena",26,"Tester","CO",57000);
	Employee emp3 = new Employee(103,"Aman",27,"Engeenier","ADMIN",12000);
	Employee emp4 = new Employee(104,"Akash",29,"Sys Engeenier","CO",30000);
	
	Scanner sc = new Scanner(System.in);
	
	boolean found = false;
	int id;
	String name;
	int age;
	String department;
	String designation;
	double sal;
	
	public EmployeeService() {
		empset.add(emp1);
		empset.add(emp2);
		empset.add(emp3);
		empset.add(emp4);
	}
	
	//view all Employees
	public void viewALLEmps() {
		for(Employee emp:empset) {
			System.out.println(emp);
		}
	}
	
	//view emp based on there id
	public void viewEmp() {
		System.out.println("Enter id:");
		id = sc.nextInt();
		for(Employee emp:empset) {
			if(emp.getId()==id) {
				System.out.println(emp);
				found = true;
			}
		}
		if(!found) {
			System.out.println("Employee with this id is not Present..");
		}
	}
	
	//Update the employee
	public void updateEmployee() {
		System.out.println("Enter Id:");
		id=sc.nextInt();
		for(Employee emp:empset) {
			if(emp.getId()==id) {
				System.out.println("Enter name:");
				name = sc.next();
				System.out.println("Enter salary:");
				sal = sc.nextDouble();
				System.out.println("Enter designation:");
				designation = sc.next();
				System.out.println("Enter department:");
				department = sc.next();
				System.out.println("Enter age:");
				age= sc.nextInt();
				emp.setDepartment(department);
			    emp.setAge(age);
			    emp.setDesignation(designation);
			    emp.setName(name);
			    emp.setSalary(sal);
			    System.out.println("Updated detail of employee are:");
			    System.out.println(emp);
			    found = true;
			}
		}
		if(!found) {
			System.out.println("Employee is not present");
		}
		else {
			System.out.println("Employee details is updated");
		}
	}
	//DELETE EMPLOYEE
	public void deleteEmp() {
		System.out.println("Enter id:");
		id= sc.nextInt();
		Employee empdelete=null;
		boolean found=false;
		for(Employee emp : empset) {
			if(emp.getId()==id) {
				empdelete= emp;
				found=true;
			}
		}
		if(!found) {
			System.out.println("Employee is not present.");
		}
		else {
			 empset.remove(empdelete);
			 System.out.println("Employee deleted successfully");
		}
	}
	public void addEmp() {
		System.out.println("Enter id:");
		id=sc.nextInt();
		System.out.println("Enter name:");
		name= sc.next();
		System.out.println("Enter age");
		age= sc.nextInt();
		System.out.println("Enter designation:");
		designation = sc.next();
		System.out.println("Enter department:");
		department = sc.next();
		System.out.println("Enter salary:");
		sal = sc.nextDouble();
		
		Employee emp = new Employee(id,name,age,designation,department,sal);
		empset.add(emp);
		System.out.println("Enter employee details is added Successfully");
		System.out.println(emp);
	}
	
}
