package org.emp;

public class Employee {
public void empId() {
	System.out.println("EmployeeId:001");
}
public void empName() {
	System.out.println("EmployeeName:Arun");
		
}
public void empDob() {
	System.out.println("EmployeeDob:06-09-1990");
	}
public void empPhone() {
	System.out.println("Employeephone:34215678");
	}
public void empEmail() {
	System.out.println("EmployeeEmail:dddd@gmail");
	}
public void empAddress() {
	System.out.println("EmployeeAddress:chennai");
	}
public static void main(String[] args) {
		Employee info = new Employee();
		info.empId();
		info.empName();
		info.empDob();
		info.empPhone();
		info.empEmail();
		info.empAddress();
	
	}

}
