package com.sgtesting.methodassignment;
class Demo10
{
	int[] assign(char b[])
	{
		int a[]=new int[b.length];
		for(int i=0;i<b.length;i++)
		{
			a[i]=b[i];
		}
		return a;
	}
}

public class assignarray {

	public static void main(String[] args) {
		Demo10 kk=new Demo10();
		char b[]= {'a','b','c','d'};
		int a[]=kk.assign(b);
		for(int z:a)
		{
			System.out.println(z);
		}
	}

}
