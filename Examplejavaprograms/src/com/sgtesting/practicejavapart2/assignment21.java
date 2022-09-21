package com.sgtesting.practicejavapart2;
abstract class maths31
{
	static
	{
		System.out.println("it is a static block");
	}
}
class maths32 extends maths31
{
	
}

public class assignment21 {

	public static void main(String[] args) {
		maths32 obj=new maths32();
		
		
	}

}
