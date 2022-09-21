package com.sgtesting.methodassignment;
class Prime
{
	String primenumberornot(int num)
	{
		String s="is a prime";
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				s="not a prime";
				break;
			}
		}
		return s;
	}
	int primenumberornot()
	{
		int count=0;
		for(int i=2;i<7;i++)
		{
			if(7%i==0)
			{
				count=count+1;
				break;
			}
		}
		return count;
	}

}

public class Primenumber {

	public static void main(String[] args) {
		Prime pp=new Prime();
		String s=pp.primenumberornot(8);
		System.out.println(s);
		int count=pp.primenumberornot();
		if(count==0)
		{
			System.out.println("it is a prime no");
		}
		else
		{
			System.out.println("it is not a prime no");
		}

	}

}
