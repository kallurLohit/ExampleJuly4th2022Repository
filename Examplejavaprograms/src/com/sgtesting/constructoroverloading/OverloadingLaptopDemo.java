package com.sgtesting.constructoroverloading;
class Laptop
{
	Laptop(String Lname,int cost)
	{
	 System.out.println("laptop name:"+Lname);
	 System.out.println("cost:"+cost);
	}
	Laptop(String Oname)
	{
		System.out.println("owner name:"+Oname);
	}
	Laptop(int wno)
	{
		System.out.println("window number:"+wno);
	}
}

public class OverloadingLaptopDemo {

	public static void main(String[] args) {
		Laptop o1=new Laptop("dell",40000);
		Laptop o2=new Laptop("lohit");
		Laptop o3=new Laptop(10);

	}

}
