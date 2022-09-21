package com.sgtesting.practicejavapart2;
class maths8
{
	void display()
	{
		System.out.println("instance method");
	}
	static void calcu()
	{
		System.out.println("static block");
	}
	maths8()
	{
		display();
		maths8.calcu();
		
		System.out.println("constructor");
	}
}

public class assignment3 {

	public static void main(String[] args) {
		maths8 zz=new maths8();
		

	}

}
