package com.sgtesting.practiceprograms;

public class WhileStringloop {

	public static void main(String[] args) {
		 String a[][]={{"apple","mango","orange"},{"tiger","lion","dog"}};
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
