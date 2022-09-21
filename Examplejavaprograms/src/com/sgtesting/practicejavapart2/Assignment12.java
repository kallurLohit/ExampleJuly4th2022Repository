package com.sgtesting.practicejavapart2;
class Maths
{
	static boolean andOperator()
	{
		boolean val=false;
		int a=2;
		int b=3;
		int c=4;
		if(b>a && b>c)
		{
			val=true;
		}
		return val;
	}
	static boolean orOperator()
	{
		boolean val=false;
		int a=2;
		int b=3;
		int c=4;
		if(b>a || b>c)
		{
			val=true;
		}
		return val;
	}
}

public class Assignment12 {

	public static void main(String[] args) {
		boolean val=Maths.andOperator();
		System.out.println(" And Is one grater than othe? "+val);
		
		boolean v=Maths.orOperator();
		System.out.println("Or is greater? "+v);
	}

}
