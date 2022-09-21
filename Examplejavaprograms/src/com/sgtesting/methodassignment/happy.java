package com.sgtesting.methodassignment;
class bad
{
	int[] morehappy(int a[])
	{
		int b[]=new int[a.length/2];
		int k=0;
		for(int i=a.length/2;i<a.length;i++)
		{
			b[k]=a[i];
			k++;
		}
		return b;
		
	}
}

public class happy {

	public static void main(String[] args) {
		bad obj=new bad();
		int a[]= {4,5,6,7,8,9};
		int b[]=obj.morehappy(a);
		for(int kk:b)
		{
			System.out.println(kk);
		}
		

	}

}
