package com.sgtesting.staticinstance;
class demo1
{
	demo1(String name)
	{
		System.out.println("the name is:"+name);
	}
	{
		System.out.println("it is a instant block");
		
	}
}

public class instancconstruct {

	public static void main(String[] args) {
         demo1 o=new demo1("santosh");
         
	}

}
