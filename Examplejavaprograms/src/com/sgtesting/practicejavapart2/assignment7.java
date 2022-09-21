package com.sgtesting.practicejavapart2;
class Overload
{
	static void getDisplay(String name )
	{
		System.out.println("this is name "+name);
	}
	static void getDisplay(String name ,int age)
	{
		System.out.println("this overload method"+name +" "+age);
		
	}
}
public class assignment7 {

	public static void main(String[] args) {
		Overload.getDisplay("what");
		Overload.getDisplay("hfjyf", 28);

	}

}
