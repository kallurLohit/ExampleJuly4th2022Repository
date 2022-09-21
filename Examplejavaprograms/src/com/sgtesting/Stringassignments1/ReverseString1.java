package com.sgtesting.Stringassignments1;

public class ReverseString1 {
	public static void main(String[]args) {
		 Reverse();
		 Reverse2();
		 Reverse3();
		
	}
	private static void Reverse()
	{
		String s="charat";
		char o[]=s.toCharArray();
		for(int i=o.length-1;i>=0;i--)
		{
			System.out.print(o[i]);
		}
		System.out.println();
	}
	private static void Reverse2() 
	{
		String s="tochararray";
		char o[]=s.toCharArray();
		for(int i=o.length-1;i>=0;i--)
		{
			System.out.println(o[i]);
		}
		System.out.println();
	}
	private static void Reverse3()
	{
		String s="substring";
		char o[]=s.toCharArray();
		for(int i=o.length-1;i>=0;i--)
		{
			System.out.println(o[i]);
		}
	}

}
