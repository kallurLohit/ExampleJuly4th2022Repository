package com.sgtesting.practiceprograms;

public class CharacterForloop {

	public static void main(String[] args) {
		 char a[][]={{'b','d','f'},{'j','k','l'}};
		for(int i=a.length-1;i>=0;i--)
		{
			for(int j=a[i].length-1;j>=0;j--)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
