package com.sgtesting.parameterizedconstructor;
class Employee
{
	String employeename;
	int employeeid;
	String employeejoiningdate;
	
	Employee(String En,int Ei,String Ed)
	{
		employeename=En;
		employeeid=Ei;
		employeejoiningdate=Ed;
		System.out.println("employee name:"+employeename+" empoloyeeid:"+employeeid+" employeejoiningdate:"+employeejoiningdate);
		System.out.println("++++++++++++++++++");	
	}
}
class Department
{
	String departmentname;
	int departmentid;
	String managername;
	
	Department(String Dn,int Di,String Mn)
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
	
	Insurenceprovider(String Ip,int Ii,String It)
	{
		insurenceprovider=Ip;
		insurenceid=Ii;
		interest=It;
		System.out.println("insurenceprovider:"+insurenceprovider+" insurenceid:"+insurenceid+" interest:"+interest);
		System.out.println("++++++++++++++++++++++++++++++");	
	}
}

public class Createobjectdemo7 {

	public static void main(String[] args) {
		Employee santu=new Employee("santosh",46,"15 july 2019");
		
		Department sales=new Department("sales",23,"naveen");
		
		Insurenceprovider health=new Insurenceprovider("health",23,"15%");
		
		
				
		
		
		

	}

}
