package com.sgtesting.constructoroverloadingandchaining;
class Resultant
{
	Resultant(int a[],int b[])
	{
		int k=0;
		int c[]=new int[a.length+b.length];
		for(int i=0;i<=a.length-1;i++)
		{
			c[k]=a[i];
			k++;
		}
		for(int m=0;m<=b.length-1;m++)
		{
			c[k]=b[m];
			k++;
		}
		for(int q=0;q<=c.length-1;q++)
		{
            System.out.println(c[q]);
		}
	}
}

public class ResultantarraysusingConstructor {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		int brr[]= {21,45,56,65};
		Resultant array=new Resultant(arr,brr);

	}

}
