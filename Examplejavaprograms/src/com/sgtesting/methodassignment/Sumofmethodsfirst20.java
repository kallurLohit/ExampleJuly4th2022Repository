package com.sgtesting.methodassignment;
class Sumofnumbers
{
	int sum()
	{
		int sum=0;
		for(int i=0;i<=20;i++)
		{
			sum=sum+i;
		}
		return sum;
	}
}

public class Sumofmethodsfirst20 {

	public static void main(String[] args) {
		Sumofnumbers ss=new Sumofnumbers();
		int k=ss.sum();
		System.out.println(k);

	}

}
