package com.sgtesting.staticinstance;
class demo
{
	{
		System.out.println("it is instance block");
	}
}

public class instanceblock {

	public static void main(String[] args) {
        demo o=new demo();
	}

}
