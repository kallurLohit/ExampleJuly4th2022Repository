package com.sgtesting.practiceprograms;

public class StringForloop {

	public static void main(String[] args) {
		 String a[][]={{"apple","mango","orange"},{"tiger","lion","dog"}};
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
