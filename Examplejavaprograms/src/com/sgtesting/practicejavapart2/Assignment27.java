package com.sgtesting.practicejavapart2;
class Demo
{
	Demo(int a[])
	{
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
}

public class Assignment27 {

	public static void main(String[] args) {
		int b[]= {4,6,7,8,9};
		Demo obj=new Demo(b);
		
		

	}

}
