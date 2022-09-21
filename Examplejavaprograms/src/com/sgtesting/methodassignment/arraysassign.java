package com.sgtesting.methodassignment;
class muutu
{
	int[] mutturamesh(int a[][])
	{
		int b[]=new int[a.length*a[0].length];
		int n=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				b[n]=a[i][j];
				n++;
			}
		}
		return b;

	}
}

public class arraysassign {

	public static void main(String[] args) {
		muutu obj=new muutu();
		int a[][]= {{3,4,5,6},{7,8,9,3}};
		int b[]=obj.mutturamesh(a);
		for(int zz:b)
		{
		
				System.out.print(zz+" ");
			
		}


	}

}
