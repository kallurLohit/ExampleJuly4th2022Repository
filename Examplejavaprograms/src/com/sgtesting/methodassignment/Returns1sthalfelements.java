package com.sgtesting.methodassignment;
class Return
{
	int[] Firsthalf(int j[])
	{
		int c[]=new int[j.length/2];
		for(int i=0;i<j.length/2;i++)
		{
			c[i]=j[i];
		}
		return c;
		
	}
}

public class Returns1sthalfelements {

	public static void main(String[] args) {
		Return hh=new Return();
		int j[]= {2,3,4,5,6,7};
		int c[]=hh.Firsthalf(j);
		for(int i=0;i<=c.length-1;i++)
		{
			System.out.println(c[i]);
		}

	}

}
