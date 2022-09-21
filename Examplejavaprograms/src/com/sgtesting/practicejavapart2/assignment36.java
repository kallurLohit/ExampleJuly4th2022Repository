package com.sgtesting.practicejavapart2;
class user
{
	void addition(int x,int y)
	{
		int res=(x+y);
		System.out.println("addition result:"+res);
	}
	void multipication(int x,int y)
	{
		int res=(x*y);
		System.out.println("multipicationres:"+res);
	}
}

public class assignment36 {

	public static void main(String[] args) {
		user obj=new user();
		obj.addition(20, 30);
		obj.multipication(5, 10);
		

	}

}
