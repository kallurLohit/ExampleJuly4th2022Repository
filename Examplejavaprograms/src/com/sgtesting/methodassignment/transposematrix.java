package com.sgtesting.methodassignment;
class Demo14
{
	int[][] transpose(int b[][])
	{
		int a[][]=new int[b[0].length][b.length];
		for(int i=0;i<=b.length-1;i++)
		{
			for(int j=0;j<=b[0].length-1;j++)
			{
				a[j][i]=b[i][j];
			}
		}
		return a;
	}
}

public class transposematrix {

	public static void main(String[] args) {
		 Demo14 zz=new  Demo14();
		 int b[][]= {{4,5,6},{6,7,8}};
		 int a[][]=zz.transpose(b);
		 for(int x[]:a)
		 {
			for(int m:x)
			{
				System.out.print(m+" ");
			}
			System.out.println();
		 }
		
	}

}
