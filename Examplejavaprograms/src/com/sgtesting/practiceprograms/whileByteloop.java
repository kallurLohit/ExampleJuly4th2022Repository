package com.sgtesting.practiceprograms;

public class whileByteloop {

	public static void main(String[] args) {
		byte a[][]={{20,30,40},{50,60,70}};
		int i=0;
		while(i<=a.length-1)
		{
			int j=0;
			while(j<=a[i].length-1)
			{
				System.out.print(a[i][j]+" ");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}

