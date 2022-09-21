package com.sgtesting.practiceprograms;

public class DoWhileCharacterloop {

	public static void main(String[] args) {
		 char a[][]={{'b','d','f'},{'j','k','l'}};
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
