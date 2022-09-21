package com.sgtestin.Inheritenceprograms;
interface Mathsaction
{
	int a=10;
	int b=15;
}
class Addition implements Mathsaction
{
	void Displayvariables()
	{
		System.out.println(a);
		System.out.println(b);
	}
}

public class Executesvairablesfrominterface5 {

	public static void main(String[] args) {
		Addition obj=new Addition ();
		obj.Displayvariables();
     
	}

}
