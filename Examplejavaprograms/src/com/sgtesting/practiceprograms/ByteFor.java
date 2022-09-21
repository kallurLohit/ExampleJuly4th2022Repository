package com.sgtesting.practiceprograms;

public class ByteFor {

	public static void main(String[] args) {
		byte a[][]={{20,30,40},{50,60,70}};
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
