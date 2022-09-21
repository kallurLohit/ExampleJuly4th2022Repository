package com.sgtesting.practiceprograms;

public class WhileDoubleloop {

	public static void main(String[] args) {
		 double a[][]={{12.25,20.56,30.24},{40.12,50.23,60.12}};
		int i=a.length-1;
		while(i>=0)
		{
			int j=a[i].length-1;
			while(j>=0)
			{
				System.out.print(a[i][j]+" ");
				j--;
			}
			System.out.println();
			i--;
		}

	}

}
