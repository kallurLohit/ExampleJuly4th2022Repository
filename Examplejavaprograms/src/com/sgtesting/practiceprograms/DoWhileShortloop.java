package com.sgtesting.practiceprograms;

public class DoWhileShortloop {

	public static void main(String[] args) {
		 short a[][]={{20,30,40},{50,60,70}};
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
