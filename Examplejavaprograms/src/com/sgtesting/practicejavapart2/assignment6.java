package com.sgtesting.practicejavapart2;
class maths16
{
	int a;
	int b;
	static int c;
	static int d;
	
}
class maths17
{
	maths17()
	{
		maths16 obj=new maths16();
		obj.a=10;
		obj.b=20;
		maths16.c=30;
		maths16.d=40;
				
		System.out.println(obj.a+" "+obj.b+" "+maths16.c+" "+maths16.d);
	}
}

public class assignment6 {

	public static void main(String[] args) {
		maths17 kk=new maths17();
		

	}

}
