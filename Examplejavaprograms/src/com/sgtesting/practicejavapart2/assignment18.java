package com.sgtesting.practicejavapart2;
class maths72
{
	static int[] arryas2(int b[][])
	{
	
		int c[]=new int[b.length];
		int n=0;
		int j=2;
		for(int i=0;i<b.length;i++)
		{
			c[n]=b[i][j];
			n++;
		}
		return c;
	}
}

public class assignment18 {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int k[]=maths72.arryas2(a);
		for(int z:k)
		{
			System.out.println(z);
		}
	}

}
