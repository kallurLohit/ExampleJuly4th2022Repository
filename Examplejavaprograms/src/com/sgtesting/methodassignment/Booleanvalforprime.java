package com.sgtesting.methodassignment;
class Prime2
{
	Boolean Primenumber2(int num)
	{
		Boolean c=true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				c=false;
				break;
			}
		
		}
		return c;
	}
}

public class Booleanvalforprime {

	public static void main(String[] args) {
		Prime2 jj=new Prime2();
		Boolean yy=jj.Primenumber2(7);
        System.out.println(yy);
	}

}
