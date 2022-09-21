package com.sgtesting.methodassignment;
class calculations4
{
	int addition(int x,int y)
	{
		return(x+y);
	}
	int substarction(int x,int y)
	{
		return (x-y);
	}
	void multipication()
	{
		int p=addition(30, 20);
		int q=substarction(30, 20);
		int c=p*q;
		System.out.println(c);
	}
}

public class Basanala {

	public static void main(String[] args) {
		calculations4 obj=new calculations4();
		obj.multipication();
		

	}

}
