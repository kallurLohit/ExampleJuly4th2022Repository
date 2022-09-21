package com.sgtesting.practicejavapart2;
class maths54
{
	{
		System.out.println("instance block");
	}
	static
	{
		System.out.println("static block");
	}
}
class maths46
{
	maths46()
	{
		maths54 obj=new maths54();
		System.out.println("constructor");
	}
}

public class Assignment10 {

	public static void main(String[] args) {
		maths46 kk=new maths46();
		

	}

}
