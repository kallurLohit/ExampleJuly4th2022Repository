package com.sgtesting.practicejavapart2;
class mthas5
{
	void display()
	{
		System.out.println("instace method");
	}
	static void calculation()
	{
		System.out.println("static method");
	}
	
	static
	{
		mthas5 obj=new mthas5();
		obj.display();
		 mthas5.calculation();
		System.out.println("static block");
	}

}

public class assignment2 {

	public static void main(String[] args) {
		mthas5 kk=new mthas5();
		
		
		

	}

}
