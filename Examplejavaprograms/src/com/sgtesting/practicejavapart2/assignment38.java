package com.sgtesting.practicejavapart2;
class calculation3
{
	int addtion(int x,int y)
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

public class assignment38 {

	public static void main(String[] args) {
		calculation3 obj=new calculation3();
		int p=obj.addtion(20, 20);
		int q=obj.substraction(40, 20);
		obj.multipication(p, q);
		

	}

}
