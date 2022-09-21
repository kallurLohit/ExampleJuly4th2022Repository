package com.sgtesting.practiceprograms;

public class DoubleForloop {

	public static void main(String[] args) {
		 double a[][]={{12.25,20.56,30.24},{40.12,50.23,60.12}};
		for(int i=a.length-1;i>=0;i--)
		{
			for(int j=a[i].length-1;j>=0;j--)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
