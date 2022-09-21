package com.sgtesting.methodassignment;
class demo45
{
	int[] factorial(int j)
	{
		int fact=1;
		int k=0;
		int g[]=new int[j];
		for(int i=j;i>=1;i--)
		{
			fact=fact*i;
			g[k]=fact;
			k++;
		}
		return g;
	}
}
class Demo50
{
	int number(int num)
	{
		int fact=1;
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
		}
		return fact;
	}
}

public class funny12 {

	public static void main(String[] args) {
		demo45 kk=new demo45();
		int z[]=kk.factorial(6);
		for(int o:z)
		System.out.println(o);
		System.out.println("=========");
		Demo50 mm=new Demo50();
		int a=mm.number(8);
		System.out.println(a);
		
	}

}
