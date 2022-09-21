package com.sgtesting.methodassignment;
class primenumber34
{
	String primenumberornot(int num)
	{
		String s="is a prime";
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				s="is not a prime";
				break;
			}
		}
		return s;
	}
}
class boolean23
{
	boolean a=true;
	boolean primenum(int num)
	{
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				a=false;
				break;
			}
		}
		return a;
	}
}

public class funny20 {

	public static void main(String[] args) {
		primenumber34 kk=new primenumber34();
		String j=kk.primenumberornot(5);
		System.out.println(j);
		boolean23 pp=new boolean23();
		boolean zz=pp.primenum(10);
		System.out.println(zz);
				
		

	}

}
