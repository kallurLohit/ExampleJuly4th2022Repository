package com.sgtesting.practicejavapart2;
class calculation
{
	void addition()
	{
		int res,x,y;
		x=25;
		y=55;
		res=x+y;
		System.out.println("addition result:"+res);
	}
	void multipication()
	{
		int res,x,y;
		x=14;
		y=5;
		res=x*y;
		System.out.println("multipication result:"+res);
	}
}

public class assignment35 {

	public static void main(String[] args) {
		calculation obj=new calculation();
		obj.addition();
		obj.multipication();
		

	}

}
