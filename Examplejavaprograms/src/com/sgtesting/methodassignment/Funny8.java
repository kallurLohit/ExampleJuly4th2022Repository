package com.sgtesting.methodassignment;
class Maths
{
	int[] arrays(int a[],int b[])
	{
		int c[]=new int[a.length+b.length];
		int n=0;
		for(int i=0;i<a.length;i++)
		{
			c[n]=a[i];
			n++;
		}
		
		for(int i=0;i<b.length;i++)
		{
			c[n]=b[i];
			n++;
		}
		return c;
	}
}

public class Funny8 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int b[]= {4,5,6,7,8,9};
		Maths m=new Maths();
		int z[]=m.arrays(a, b);
		
		for(int k:z)
		{
			System.out.println(k);
		}
		
	}

}
