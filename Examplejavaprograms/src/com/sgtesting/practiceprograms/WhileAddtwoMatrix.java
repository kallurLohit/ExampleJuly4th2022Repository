package com.sgtesting.practiceprograms;

public class WhileAddtwoMatrix {

	public static void main(String[] args) {
		int a[][]= {{2,8,6},{5,9,7}};
		int b[][]= {{10,14,16},{20,24,28}};
		int c[][]=new int[2][3];
		int i=0;
		while(i<=b.length-1)
		{
			int j=0;
			while(j<=b[i].length-1)
			{
				c[i][j]=b[i][j]+a[i][j];
				System.out.print(c[i][j]);
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
