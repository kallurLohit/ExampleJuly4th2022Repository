package com.sgtesting.practicejavapart2;
class Demo1
{
	Demo1(int a[])
	{
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
	Demo1(int num)
	{
		int fact=1;
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
			
		}
		System.out.println("factorial of given number:"+fact);
	}
}

public class Assignment28 {

	public static void main(String[] args) {
		int c[]= {2,3,4,5,6};
		Demo1 kk=new Demo1(c);
		Demo1 obj=new Demo1(5);
		

	}

}
