package com.sgtesting.inheritenceassignments;
class maths12
{
	void addition(int x,int y)
	{
		int res=x+y;
		System.out.println(res);
	}
}
class maths13 extends maths12
{
	void substraction(int x,int y)
	{
		int res=x-y;
		System.out.println(res);
	}
}
class maths4 extends maths13
{
	void multipication(int a,int b)
	{
		int res=a*b;
		System.out.println(res);
	}
}
class maths5 extends maths2
{
	void division(int x,int y)
	{
		int div=x/y;
		System.out.println(div);
	}
}

public class Hybridinheritence {

	public static void main(String[] args) {
      maths4 obj=new maths4();
      obj.addition(10,20);
      obj.substraction(30,10);
      obj.multipication(10,5);
      maths5 bb=new maths5();
      bb.addition(20, 10);
      bb.division(30, 10);
	}

}
