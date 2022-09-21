package com.sgtesting.staticinstance;
class maths
{
	static String type;
	static int marks;
	static void addition(int x,int y)
	{
		int res=(x+y);
		System.out.println("addition:"+res);
	}
}

public class staticmemberavilindipndclass {
	public static void main(String[] args) {
      maths.type="algebra";
      maths.marks=75;
      System.out.println(maths.type);
      System.out.println(maths.marks);
      maths.addition(20, 30);
	}

}
