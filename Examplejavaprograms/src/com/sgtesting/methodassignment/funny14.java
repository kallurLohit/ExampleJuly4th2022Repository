package com.sgtesting.methodassignment;
class sumnumber
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
class oddnumber
{
	int odd()
	{
		int count=0;
		for(int i=91;i>=31;i--)
		{
			if(i%2==0)
			{
				count=count+1;
			}
		}
		return count;
	}
}
class numberbetween
{
	int between()
	{
		int count=0;
		for(int i=50;i<=100;i++)
		{
			if(i%2==0)
			{
				count=count+1;
			}
		}
		return count;
	}
}
class evennumber
{
	int even()
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

public class funny14 {

	public static void main(String[] args) {
		sumnumber kk=new sumnumber();
		int k=kk.sum();
		System.out.println(k);
		 oddnumber mm=new  oddnumber();
		 int z=mm.odd();
		 System.out.println(z);
		 numberbetween pp=new  numberbetween();
		 int aa=pp.between();
		 System.out.println(aa);
		 evennumber rr=new evennumber();
		 int yy=rr.even();
		 System.out.println(yy);
				 
				 
		

	}

}
