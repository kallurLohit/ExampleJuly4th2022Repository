package com.sgtesting.methodassignment;
class fibnacci
{
	int[] fibanacci()
	{
		int first=0;
		System.out.println(first);
		int second=1;
		System.out.println(second);
		int a[]=new int[6];
		for(int i=0;i<6;i++)
		{
			int third=first+second;
			a[i]=third;
			first=second;
			second=third;
		}
		return a;
	}
}

public class funny5 {

	public static void main(String[] args) {
		fibnacci kk=new fibnacci();
		int a[]=kk.fibanacci();
		for(int mm:a)
		{
			System.out.println(mm);
		}
		

	}

}
