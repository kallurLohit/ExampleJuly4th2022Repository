package com.sgtesting.practicejavapart2;
class maths76
{
	static int[] even()
	{
		int a[]=new int[3];
		int n=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				a[n]=i;
				n++;
			}
			if(n==3)
			{
				break;
			}
		}
		return a;
	}
}

public class Assignment11 {

	public static void main(String[] args) {
		int z[]=maths76.even();
		for(int k:z)
		{
			System.out.println(k);
		}

	}

}
