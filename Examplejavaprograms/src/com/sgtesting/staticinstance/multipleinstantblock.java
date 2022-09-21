package com.sgtesting.staticinstance;
class demo2
{
	{
		System.out.println("it is a first in stant block");
	}
	{
		System.out.println("it is a second instant block");
	}
	{
		System.out.println("it is third instant block");
	}
}
public class multipleinstantblock {

	public static void main(String[] args) {
        demo2 o=new demo2();
	}

}
