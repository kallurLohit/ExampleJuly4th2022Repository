package com.sgtesting.methodassignment;
class Evennumbers
{
	int sumeven()
	{
		int sum=0;
		for(int i=250;i<=350;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
}

public class Sumofevennumber {

	public static void main(String[] args) {
		Evennumbers kk=new Evennumbers();
		int y=kk.sumeven();
		System.out.println(y);

	}

}
