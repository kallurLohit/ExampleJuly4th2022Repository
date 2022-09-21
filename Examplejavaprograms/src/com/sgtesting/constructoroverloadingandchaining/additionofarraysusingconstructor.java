package com.sgtesting.constructoroverloadingandchaining;
class Addition
{
	Addition(int a[][],int b[][])
	{
		
		int c[][]=new int[a.length][a[0].length];
		for(int i=0;i<=a.length-1;i++)
		{
			for(int m=0;m<=a[0].length-1;m++)
			{
				c[i][m]=a[i][m]+b[i][m];
			}
		}
		for(int j=0;j<=c.length-1;j++)
		{
			for(int y=0;y<=c[0].length-1;y++)
			{
				System.out.print(c[j][y]+" ");
			}
			System.out.println(" ");
			
		}
	}
}

public class additionofarraysusingconstructor {

	public static void main(String[] args) {
		int a[][]= {{2,33,41},{5,6,7}};
		int b[][]= {{4,6,7},{9,3,4}};
		Addition array=new Addition(a,b);

	}

}
