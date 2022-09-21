package com.sgtesting.practicejavapart2;
class Demo4
{
	Demo4(int a[],int b[])
	{
		
		int d[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			d[i]=a[i]-b[i];
			System.out.print(d[i]+" ");
		}
		
	}
}

public class assignment30 {

	public static void main(String[] args) {
		int a[]= {4,6,7};
		int b[]= {7,8,9};
		 
		 Demo4 obj=new  Demo4(a,b);
		 
		

	}

}
