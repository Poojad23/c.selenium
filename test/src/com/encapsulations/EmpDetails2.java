package com.encapsulations;

public class EmpDetails2 {
	private int Emp_Id;
	private String Emp_Name;
	private String designation;
	private String department;
	private char gender ;
	private double salary;
	
	public void setEmp_Details(int emp_Id,String emp_Name,String desg,String dept,char gen,double sal) {
		Emp_Id = emp_Id;
	    Emp_Name=emp_Name;
		designation=desg;
		department=dept;
		gender=gen ;
		salary=sal;
	}
	public void getEmp_Details() {
		System.out.println(" Emp ID : "+ this.Emp_Id +" \n Emp Name : "+this.Emp_Name+"\n Emp Designation : "+this.designation+"\n Emp Dept : "+this.department+"\n Emp Dept : "+this.gender+"\n Salary:"+this.salary+" PA");
		
	}
	public static void main(String args[]) {
		
		EmpDetails2 e = new EmpDetails2();
		
		e.setEmp_Details(2,"Pooja","QA Eng","Testing",'F',1000000);
		e.getEmp_Details();
		
	}	
}
