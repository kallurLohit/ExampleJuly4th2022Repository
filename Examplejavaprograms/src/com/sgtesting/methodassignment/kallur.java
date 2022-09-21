package com.sgtesting.methodassignment;
class calculations
{
	int addition(int x,int y)
	{
		return (x+y);
	}
	int substraction(int x,int y)
	{
		return (x-y);
	}
	void multipication(int a,int b)
	{
		int d=a*b;
		System.out.println(d);
	}
}

public class kallur {

	public static void main(String[] args) {
		calculations obj=new calculations();
		int p=obj.addition(20, 10);
		int q=obj.substraction(40, 20);
		obj.multipication(p, q);
		

	}

}
