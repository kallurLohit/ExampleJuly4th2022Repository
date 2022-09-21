package com.sgtesting.practiceprograms;

public class DoWhileLastRow {

	public static void main(String[] args) {
		int b[][]= {{2,3,4},{4,5,6}};
		int i=0;
		do
		{
			int j=-1;
			do
			{
				j++;
				if(i<=b.length-2)
				{
					continue;
				}
				System.out.print(b[i][j]+" ");
				
			}while(j<=b[i].length-1);
			System.out.println();
			i++;
		}while(i<=b[i].length-1);

	}

}
