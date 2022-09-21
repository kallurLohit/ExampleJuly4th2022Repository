package com.sgtesting.methodassignment;
class factorial20
{
	int factorialnumber()
	{
		int fact=1;
		for(int i=5;i>=1;i--)
		{
			fact=fact*i;
		}
		return fact;
	}
	
	int[][] addition(int a[][],int b[][])
	{
		int c[][]=new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<=a[0].length-1;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		return c;
		
	}
}

public class funny1 {

	public static void main(String[] args) {
		factorial20 ii=new factorial20();
		int h=ii.factorialnumber();
		System.out.println(h);
		System.out.println("=================");
		int a[][]= {{2,3,4},{6,7,8}};
		int b[][]= {{10,30,40},{50,60,70}};
		int c[][]=ii.addition(a, b);
		for(int kk[]:c)
		{
			for(int d:kk)
			{
				System.out.print(d+ "  ");
			}
			System.out.println();
		}
		

	}

}
