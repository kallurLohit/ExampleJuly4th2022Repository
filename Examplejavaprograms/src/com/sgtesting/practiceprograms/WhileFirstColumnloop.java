package com.sgtesting.practiceprograms;

public class WhileFirstColumnloop {

	public static void main(String[] args) {
		int b[][]= {{2,3,4},{4,5,6},{7,8,9}};
		int i=0;
		while(i<=b.length-1)
		{
			int j=-1;
			while(j<=b[i].length-1)
			{
				j++;
				if(j>=1)
				{
					continue;
				}
				System.out.print(b[i][j]+" ");
				}
			System.out.println();
			i++;
		}
	}
}

	

