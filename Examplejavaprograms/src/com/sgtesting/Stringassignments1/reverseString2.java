package com.sgtesting.Stringassignments1;

public class reverseString2 {

	public static void main(String[] args) {
		charAt();
		CharAtmethod();

	}
	private static void charAt()
	{
		String s="program";
		int n=7;
		for(int i=6;i>=0;i--)
		{
			System.out.print(s.substring(i, n));
			n--;
		}
		System.out.println();
	}
	private static void CharAtmethod()
	{
		String s="program";
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
	}

}
