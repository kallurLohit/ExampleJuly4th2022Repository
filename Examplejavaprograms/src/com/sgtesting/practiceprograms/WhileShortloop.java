package com.sgtesting.practiceprograms;

public class WhileShortloop {

	public static void main(String[] args) {
		 short a[][]={{20,30,40},{50,60,70}};
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
