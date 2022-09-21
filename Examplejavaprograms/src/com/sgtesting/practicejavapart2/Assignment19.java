package com.sgtesting.practicejavapart2;
class maths36
{
	static int[] evennumber()
	{
		int b[]=new int[3];
		int n=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				b[n]=i;
				n++;
			}
			if(n==3)
			{
				break;
			}
		}
		return b;
	}
}

public class Assignment19 {

	public static void main(String[] args) {
		int c[]= maths36.evennumber();
		for(int k:c)
		{
			System.out.println(k);
		}
		
	}

}
