package com.sgtesting.practicejavapart2;
abstract class maths33
{
	maths33(String fname)
	{
		System.out.println("first name is :"+fname);
	}
	maths33(int id)
	{
		System.out.println("id of the student:"+id);
	}
}
class maths39 extends maths33
{
	maths39(String s)
	{
		super(s);
	}
	maths39(int k)
	{
		super(k);
	}
}

public class assignment23 {

	public static void main(String[] args) {
		maths39 obj1=new maths39("lohit");
		maths39 obj2=new maths39(25);
		

	}

}
