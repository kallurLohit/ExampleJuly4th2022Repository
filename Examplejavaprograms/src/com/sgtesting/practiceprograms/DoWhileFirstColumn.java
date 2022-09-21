package com.sgtesting.practiceprograms;

public class DoWhileFirstColumn {

	public static void main(String[] args) {
		int b[][]= {{2,3,4},{4,5,6},{7,8,9}};
		int i=0;
		do
		{
			int j=-1;
			do
			{
				j++;
				if(j>=1)
				{
					continue;
				}
				System.out.print(b[i][j]+" ");
				}while(j<=b[i].length-1);
			System.out.println();
			i++;
		}while(i<=b.length-1);
	}
}

	

