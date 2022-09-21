package com.sgtesting.staticinstance;
class calculation
{
	static int getfactorial(int num)
	{
		int fact=1;
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
		}
		return fact;
	}
	static int gettingarray(int a[])
	{
		int sum=0;
		for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		return sum;
			
	}
}

public class staticmethodreturnvalue {

	public static void main(String[] args) {
        int res=calculation.getfactorial(5);
		System.out.println("factorial resulr:"+res);
		int a[]= {2,3,4,5,6,7};
		int sumres=calculation.gettingarray(a);
		System.out.println("sum of elements:"+res);
		
	}

}
