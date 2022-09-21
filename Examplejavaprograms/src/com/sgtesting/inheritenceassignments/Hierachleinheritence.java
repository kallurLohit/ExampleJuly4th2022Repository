package com.sgtesting.inheritenceassignments;
class maths14
{
	void addition(int x,int y)
	{
		int res=x+y;
		System.out.println(res);
	}
}
class maths15 extends maths14
{
	void substraction(int x,int y)
	{
		int res=x-y;
		System.out.println(res);
	}
}
class maths6 extends maths15
{
	void multipication(int a,int b)
	{
		int res=a*b;
		System.out.println(res);
	}
}

public class Hierachleinheritence {

	public static void main(String[] args) {
      maths15 obj=new maths15();
      obj.addition(30, 30);
      obj.substraction(30,10);
      maths6 bb=new maths6();
      bb.addition(20, 30);
      bb.multipication(30, 30);
	}

}
