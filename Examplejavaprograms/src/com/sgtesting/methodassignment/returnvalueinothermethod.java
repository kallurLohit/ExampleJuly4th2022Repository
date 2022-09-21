package com.sgtesting.methodassignment;
class calculations1
{
	int addition(int x,int y)
	{
		return(x+y);
	}
	int substraction(int x,int y)
	{
		return(x-y);
	}
	void multipication(int a,int b)
	{
		int c=a*b;
		System.out.println(c);
	}
}

public class returnvalueinothermethod {

	public static void main(String[] args) {
		calculations1 obj=new calculations1();
		int p=obj.addition(20, 30);
		int q=obj.substraction(50, 30);
		obj.multipication(p, q);
				
		

	}

}
