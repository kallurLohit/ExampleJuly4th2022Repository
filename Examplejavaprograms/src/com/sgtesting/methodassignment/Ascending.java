package com.sgtesting.methodassignment;
class asscending2
{
	int[] ascending(int a[])
	{
		int b[]=new int[a.length];
		int temp=0;
		int n=0;
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
		}
		return b;
	}
}
		

public class Ascending {

	public static void main(String[] args) {
		asscending2 obj=new asscending2();
		int a[]= {6,4,8,2,9,1};
		int c[]=obj.ascending(a);
		for(int kk:c)
		{
			System.out.println(kk);
			System.out.println("++++++++++++++");
		}
		for(int j=a.length-1;j>=0;j--)
		{
			System.out.println(c[j]);
		}
		

	}

}
