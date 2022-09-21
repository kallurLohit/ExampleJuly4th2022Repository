package com.sgtesting.inheritenceassignments;
class maths1
{
	void addition(int x,int y)
	{
		int res=x+y;
		System.out.println(res);
	}
}
class maths2 extends maths1
{
	void substraction(int x,int y)
	{
		int res=x-y;
		System.out.println(res);
	}
}
class maths3 extends maths2
{
	void multipication(int a,int b)
	{
	      int res=a*b;
	      System.out.println(res);
	}
}

public class Multilevelinheritence {

	public static void main(String[] args) {
	maths3 obj=new maths3();
	obj.addition(10, 20);
	obj.substraction(20,5);
	obj.multipication(10, 5);

	}

}
