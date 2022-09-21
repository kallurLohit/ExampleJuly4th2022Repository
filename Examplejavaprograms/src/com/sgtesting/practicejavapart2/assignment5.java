package com.sgtesting.practicejavapart2;
class maths13
{
	void bloc()
	{
		System.out.println("instance block");
	}
}
class maths14
{
	maths14()
	{
		maths13 obj=new maths13();
		obj.bloc();
		System.out.println("constructor");
	}
}

public class assignment5 {

	public static void main(String[] args) {
		maths14 zz=new maths14();
		

	}

}
