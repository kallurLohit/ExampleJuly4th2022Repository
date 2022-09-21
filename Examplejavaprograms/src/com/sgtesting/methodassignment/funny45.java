package com.sgtesting.methodassignment;
class transpose3
{
	int[][] transposed(int a[][])
	{
		int c[][]=new int[a.length][a[0].length];
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[0].length-1;j++)
			{
				c[i][j]=a[j][i];
			}
		}
		return c;
	}
}

public class funny45 {

	public static void main(String[] args) {
		transpose3 obj=new transpose3();
		int a[][]= {{2,3,4},{4,5,6},{6,7,8}};
		int c[][]=obj.transposed(a);
		for(int z[]:c)
		{
			for(int k:z)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
		

	}

}
