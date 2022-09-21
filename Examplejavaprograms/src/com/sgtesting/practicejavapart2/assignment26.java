package com.sgtesting.practicejavapart2;
abstract class maths81
{
	abstract void collegename(String name);
	abstract void location(String lname);
	void branches(String s[])
	{
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}
}
class SLNeng extends maths81
{
	void collegename(String name)
	{
		System.out.println("college namwe:"+name);
	}
	void location(String k)
	{
		System.out.println("location of the college:"+k);
	}
	void adress(String adress)
	{
		System.out.println("the adress of eng college:"+adress);
	}
}

public class assignment26 {

	public static void main(String[] args) {
		SLNeng obj=new SLNeng();
		obj.collegename("SLN engineering college");
		obj.location("banglore");
		obj.adress("Rpc layout");
		String b[]= {"mech","cse","civil","eee"};
		obj.branches(b);
		
		

	}

}
