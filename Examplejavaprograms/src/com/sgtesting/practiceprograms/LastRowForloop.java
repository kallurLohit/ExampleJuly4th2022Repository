package com.sgtesting.practiceprograms;

public class LastRowForloop {

	public static void main(String[] args) {
		int b[][]= {{2,3,4},{4,5,6},{7,8,9}};
		for(int i=0;i<=b.length-1;i++)
		{
			for(int j=0;j<=b[i].length-1;j++)
			{
				if(i<=b.length-2)
				{
					continue;
				}
				System.out.print(b[i][j]+" ");
				
			}
			System.out.println();
		}

	}

}
