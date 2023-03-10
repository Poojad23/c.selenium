package com.encapsulations;


public class EmpDetails {
	private int Emp_Id;
	private String Emp_Name;
	private String designation;
	private String department;
	private char gender ;
	private double salary;
	
	
	
	public void setEmp_id(int emp_Id) {
		Emp_Id = emp_Id;
		
	}
	public void setEmp_name(String emp_Name) {
		Emp_Name = emp_Name;
		
	}
	public void setDesignation(String Designation) {
		designation = Designation;
		
	}
	public void setDepartment(String Department) {
		department = Department;
		
	}
	public void setGender(char Gender) {
		gender = Gender;
	}
	public void setSalary(double Salary) {
		salary = Salary;
	}
	
	
	public int getEmp_id() {
		
		return Emp_Id;	
	}
	
	public String getEmp_name() {
		//System.out.println(" Emp ID : ");
		return Emp_Name;	
	}
	
	public String getDesignation() {
		return designation;	
	}
	
	public String getDepartment() {
		return department;	
	}
	public char getGender() {
		return gender;	
	}
	public double getSalary() {
		return salary;	
	}
		
	
	public static void main(String args[]) {
	
		EmpDetails e = new EmpDetails();
		
		e.setEmp_id(1);
		e.setEmp_name("Pooja");
		e.setDesignation("QA Engineer");
		e.setDepartment("Testing");
		e.setGender('F');
		e.setSalary(1200000);
	
		System.out.println(" Emp ID : "+e.getEmp_id()+" \n Emp Name : "+e.getEmp_name()+"\n Emp Designation : "+e.getDesignation()+"\n Emp Dept : "+e.getDepartment()+"\n Emp Dept : "+e.getGender()+"\n Salary : "+e.getSalary()+"PA");
		
	}	
	
}
