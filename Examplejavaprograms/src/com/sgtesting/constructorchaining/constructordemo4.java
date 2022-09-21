package com.sgtesting.constructorchaining;
class Arrays1
{
	Arrays1(int a[])
	{
		int b[]=new int[a.length];
		for(int i=a.length/2;i<a.length;i++)
		{
			b[i]=a[i];
		}
		for(int j=b.length/2;j<=b.length;j++)
		{
			System.out.println(b[j]);
			
		}
		System.out.println("+++++++++++++");
	}
}


public class constructordemo4 {

	public static void main(String[] args) {
		int d[]= {10,20,30,40,50,60,70,80};
		Arrays1 obj=new Arrays1(d);
		int arr[]= {5,10,15,20,25,30,35,40};
		Arrays1 obj1=new Arrays1(arr);
	}

}
