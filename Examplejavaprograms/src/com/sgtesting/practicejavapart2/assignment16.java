package com.sgtesting.practicejavapart2;
class maths75
{
	static int[] array(int b[])
	{
		int n=0;
		int c[]=new int[b.length/2];
		for(int i=b.length/2;i<b.length;i++)
		{
			c[n]=b[i];
			n++;
		}
		return c;
	}
}

public class assignment16 {

	public static void main(String[] args) {
		maths75 obj=new maths75();
		int b[]= {5,6,8,9,4,7,8,2};
		int h[]=maths75.array(b);
		for(int k:h)
		{
			System.out.println(k);
		}

	}

}
