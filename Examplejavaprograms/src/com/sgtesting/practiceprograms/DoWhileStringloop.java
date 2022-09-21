package com.sgtesting.practiceprograms;

public class DoWhileStringloop {

	public static void main(String[] args) {
		 String a[][]={{"apple","mango","orange"},{"tiger","lion","dog"}};
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
