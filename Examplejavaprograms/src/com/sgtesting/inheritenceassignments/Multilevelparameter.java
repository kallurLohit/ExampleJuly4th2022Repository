package com.sgtesting.inheritenceassignments;
class AA
{
	AA(String name,String city)
	{
		System.out.println("AAA name:"+name);
		System.out.println(("AAA city:"+city));
	}
}
class BB extends AA
{
	BB(int rollno)
	{
		super("kiran","banglore");
		System.out.println("bb rollno:"+rollno);
	}
}
class CC extends BB
{
	CC(int y)
	{
		super(y);
	}
}

public class Multilevelparameter {

	public static void main(String[] args) {
      CC mn=new CC(25);
	}

}
