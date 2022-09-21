package com.sgtesting.methodassignment;
class addition4
{
	int[][] additionmatrx(int a[][],int b[][])
	{
		int c[][]=new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		return c;
	}
}

public class Demo34 {

	public static void main(String[] args) {
		addition4 obj=new addition4();
		int a[][]= {{3,4,5},{6,7,8}};
		int b[][]= {{10,20,30},{40,50,60}};
		int c[][]=obj.additionmatrx(a, b);
		for(int k[]:c)
		{
			for(int s:k)
			{
				System.out.print(s+" ");
			}
			System.out.println();
		}
		

	}

}
