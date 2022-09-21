package com.sgtesting.practiceencapsulation;
class Employee
{
	String employeename;
	int employeeid;
	String employeejoiningdate;
			
}
class Department
{
	String departmentname;
	int departmentid;
	String managername;
		
}
class Insurenceprovider
{
	String insurenceprovider;
	int insurenceid;
	String interest;
	
}

public class Createobjectdemo7 {

	public static void main(String[] args) {
		Employee santu=new Employee();
		santu.employeename="santosh";
		santu.employeeid=46;
		santu.employeejoiningdate="15 jul 2019";
		System.out.println("employee name:"+santu.employeename+" empoloyeeid:"+santu.employeeid+" employeejoiningdate:"+santu.employeejoiningdate);
		System.out.println("++++++++++++++++++");	
		Department sales=new Department();
		sales.departmentname="sales";
		sales.departmentid=23;
	    sales.managername="naveen";
		System.out.println("department name:"+sales.departmentname+" departmentid:"+sales.departmentid+" managername:"+sales.managername);
		System.out.println("+++++++++++++++++++++++++");
		Insurenceprovider health=new Insurenceprovider();
		health.insurenceprovider="health";
		health.insurenceid=23;
		health.interest="15";
		System.out.println("insurenceprovider:"+health.insurenceprovider+" insurenceid:"+health.insurenceid+" interest:"+health.interest);
		System.out.println("++++++++++++++++++++++++++++++");
		
		
				
		
		
		

	}

}
