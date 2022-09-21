package com.sgtesting.practicejavapart2;
class calculation6
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
		int p=addition(15, 20);
		int q=substraction(40,20);
		System.out.println("multipication:"+c);
		
	}
}

public class Assignment39 {

	public static void main(String[] args) {
		calculation6 obj=new calculation6();
		obj.multipication(10, 5);

	}

}
