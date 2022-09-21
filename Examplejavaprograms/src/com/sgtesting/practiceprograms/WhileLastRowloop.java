package com.sgtesting.practiceprograms;

public class WhileLastRowloop {

	public static void main(String[] args) {
		int b[][]= {{2,3,4},{4,5,6}};
		int i=0;
		while(i<=b.length-1)
		{
			int j=-1;
			while(j<=b[i].length-1)
			{
				j++;
				if(i<=b.length-2)
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
