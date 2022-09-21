package com.sgtesting.practicejavapart2;
class Demo5
{
	Demo5(int b[][])
	{
		int c[][]=new int[b.length][b[0].length];
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[0].length;j++)
			{
				c[i][j]=b[j][i];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}

public class assignment31 {

	public static void main(String[] args) {
		int f[][]= {{4,5,6},{7,8,9},{1,5,7}};
		Demo5 obj=new Demo5(f);
		

	}

}
