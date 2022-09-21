package com.sgtesting.practiceprograms;

public class DoWhileDoubleloop {

	public static void main(String[] args) {
		 double a[][]={{12.25,20.56,30.24},{40.12,50.23,60.12}};
		int i=a.length-1;
		do
		{
			int j=a[i].length-1;
			do
			{
				System.out.print(a[i][j]+" ");
				j--;
			}while(j>=0);
			System.out.println();
			i--;
		}while(i>=0);

	}

}
