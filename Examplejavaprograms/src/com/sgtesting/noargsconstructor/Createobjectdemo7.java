package com.sgtesting.noargsconstructor;
class Employee
{
	String employeename;
	int employeeid;
	String employeejoiningdate;
	
	Employee()
	{
		employeename="santosh";
		employeeid=46;
		employeejoiningdate="15 jul 2019";
		System.out.println("employee name:"+employeename+" empoloyeeid:"+employeeid+" employeejoiningdate:"+employeejoiningdate);
		System.out.println("++++++++++++++++++");	
	}
}
class Department
{
	String departmentname;
	int departmentid;
	String managername;
	
	Department()
	{
		departmentname="sales";
		departmentid=23;
		managername="naveen";
		System.out.println("department name:"+departmentname+" departmentid:"+departmentid+" managername:"+managername);
		System.out.println("+++++++++++++++++++++++++");	
	}
}
class Insurenceprovider
{
	String insurenceprovider;
	int insurenceid;
	String interest;
	
	Insurenceprovider()
	{
		insurenceprovider="health";
		insurenceid=23;
		interest="15";
		System.out.println("insurenceprovider:"+insurenceprovider+" insurenceid:"+insurenceid+" interest:"+interest);
		System.out.println("++++++++++++++++++++++++++++++");	
	}
}

public class Createobjectdemo7 {

	public static void main(String[] args) {
		Employee santu=new Employee();
		
		Department sales=new Department();
		
		Insurenceprovider health=new Insurenceprovider();
		
		
				
		
		
		

	}

}
