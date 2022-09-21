package com.sgtesting.staticinstance;
class test1
{
	
	static
	{
		System.out.println("This is static block");
		
	}
	test1()
	{
		System.out.println("This is constructor");
	}
	
}
class test2
{
	

	{
		test1 o=new test1();
		System.out.println("this is a instance block");
	}
	
}


public class staticblock {

	public static void main(String[] args) {
		test2 o=new test2();
      
	}

}
