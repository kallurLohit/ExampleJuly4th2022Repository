package com.sgtesting.practicejavapart2;
class maths78
{
	static int[] cube()
	{
		int b[]=new int[4];
		int n=0;
		int cube;
		for(int i=4;i>=1;i--)
		{
			cube=(i*i*i);
			b[n]=cube;
			n++;
		}
		return b;
	}
}

public class assignment14 {

	public static void main(String[] args) {
		maths78 obj=new maths78();
		int b[]=maths78.cube();
		for(int z:b)
		{
			System.out.println(z);
		}

	}

}
