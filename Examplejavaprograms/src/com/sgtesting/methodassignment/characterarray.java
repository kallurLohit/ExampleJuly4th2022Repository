package com.sgtesting.methodassignment;
class Demo36
{
	char[][] array()
	{
		char a[][]= {{'a','b','c','d'},{'e','f','g','h'}};
		return a;
	}
}

public class characterarray {

	public static void main(String[] args) {
		Demo36 obj=new Demo36();
		char b[][]=obj.array();
		for(char z[]:b)
		{
			for(char p:z)
			{
				System.out.print(p);
			}
			System.out.println();
		}
		

	}

}
