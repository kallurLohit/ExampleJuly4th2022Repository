package com.sgtesting.methodassignment;

class Maths100
{
	int[] arrays(int a[][])
	{
		int z[]=new int[a.length*a[0].length];
		int n=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				z[n]=a[i][j];
				n++;
			}
		}
		
		return z;
	}
}

public class Funny9 {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6}};
		Maths100 m=new Maths100();
		int ret[]=m.arrays(a);
		for(int k:ret)
		{
			System.out.println(k);
		}
	}

}
