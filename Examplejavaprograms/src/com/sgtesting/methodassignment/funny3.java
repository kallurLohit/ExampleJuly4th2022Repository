package com.sgtesting.methodassignment;
class fibbonaccci
{
	int[] fibonacci()
	{
		int first=0;
		int second=1;
		int third;
		int c[]=new int[8];
		for(int i=0;i<8;i++)
		{
			third=first+second;
			c[i]=third;
			first=second;
			second=third;
			
		}
		return c;
	}
}

public class funny3 {

	public static void main(String[] args) {
		fibbonaccci vv=new fibbonaccci();
		int y[]=vv.fibonacci();
		for(int g:y)
		{
			System.out.println(g);
		}

	}

}
