package com.sgtesting.practicejavapart2;
class maths25
{
	static
	{
		System.out.println("static block1");
	}
}
class maths34
{
   static
   {
	   maths25 obj=new maths25();
	   System.out.println("static block2");
   }
}




public class assignment9 {

	public static void main(String[] args) {
		maths34 kk=new maths34();
		
		

	}

}
