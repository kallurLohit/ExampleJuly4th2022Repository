package com.sgtesting.practiceprograms;

public class DoWhileLongloop {

	public static void main(String[] args) {
		long a[][]={{20,30,40},{50,60,70}};
		int i=0;
		do
		{
			int j=0;
			do
			{
				System.out.print(a[i][j]+" ");
				j++;
			}while(j<=a[i].length-1);
			System.out.println();
			i++;
		}while(i<=a.length-1);

	}

}
