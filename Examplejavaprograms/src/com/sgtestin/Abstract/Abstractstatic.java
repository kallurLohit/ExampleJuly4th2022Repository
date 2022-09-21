package com.sgtestin.Abstract;
abstract class student
{
	static
	{
		System.out.println("this is a static block in abstract class");
	}
}
class student2 extends student
{
	
}

public class Abstractstatic {

	public static void main(String[] args) {
        student2 obj=new student2();
        
	}

}
