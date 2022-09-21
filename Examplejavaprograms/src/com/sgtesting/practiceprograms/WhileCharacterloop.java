package com.sgtesting.practiceprograms;

public class WhileCharacterloop {

	public static void main(String[] args) {
		 char a[][]={{'b','d','f'},{'j','k','l'}};
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
