package com.sgtesting.practicejavapart2;
abstract class maths67
{
	void display(String fname,int cost)
	{
		System.out.println("first name:"+fname+" sallery of student:"+cost);
	}
}
class maths68 extends maths67
{
	
}

public class assignment25 {

	public static void main(String[] args) {
		maths68 obj=new maths68();
		obj.display("sandy", 25000);

	}

}
