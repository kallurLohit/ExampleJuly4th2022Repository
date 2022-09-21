package com.sgtesting.practiceprograms;

public class SubsTwoMatrixFor {

	public static void main(String[] args) {
		int a[][]= {{2,8,6},{5,9,7}};
		int b[][]= {{10,14,16},{20,24,28}};
		int c[][]=new int[2][3];
		for(int i=0;i<=b.length-1;i++)
		{
			for(int j=0;j<=b[i].length-1;j++)
			{
				c[i][j]=b[i][j]-a[i][j];
				System.out.print(c[i][j]);
			}
			System.out.println();
		}

	}

}
