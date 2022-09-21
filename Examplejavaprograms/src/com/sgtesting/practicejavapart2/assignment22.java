package com.sgtesting.practicejavapart2;
abstract class maths52
{
	maths52(String fname)
	{
		System.out.println("firstname:"+fname);
	}
}
class maths51 extends maths52
{
	maths51(String s)
	{
		super(s);
	}
}

public class assignment22 {

	public static void main(String[] args) {
		maths51 m=new maths51("Lohit");

	}

}
