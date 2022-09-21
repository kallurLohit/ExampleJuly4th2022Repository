package com.sgtesting.practicejavapart2;
class Demouser
{
	Demouser(int a[])
	{
		int b[]=new int[a.length];
		int n=0;
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			b[n]=a[i];
			n++;
			//System.out.println(a[i]);
		}
		for(int k:b)
		{
			System.out.println(k);
		}
	}
}

public class Assignment32 {

	public static void main(String[] args) {
		int a[]= {4,7,5,9,3,2};
		Demouser obj=new Demouser(a);
		

	}

}
