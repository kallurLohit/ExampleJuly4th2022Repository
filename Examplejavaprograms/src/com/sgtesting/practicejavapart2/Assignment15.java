package com.sgtesting.practicejavapart2;
class maths56
{
	static int[] cubic()
	{
		int b[]=new int[4];
		int cube;
		int n=0;
		for(int i=4;i>=1;i--)
		{
			cube=(i*i*i);
			b[n]=cube;
			n++;
		}
		return b;
	}
}

public class Assignment15 {

	public static void main(String[] args) {
		maths56 obj=new maths56();
		int c[]=maths56.cubic();
		for(int z:c)
		{
			System.out.println(z);
		}

	}

}
