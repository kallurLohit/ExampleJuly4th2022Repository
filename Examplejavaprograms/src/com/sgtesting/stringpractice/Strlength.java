package com.sgtesting.stringpractice;

public class Strlength {

	public static void main(String[] args) {
		Strlength();
		isemptyString();
		isLowerCaseString();
		isupperString();
		extractString();
		replaceString();
		SplitString();
		getCharArray();
		compareString1();
  
	}
	private static void Strlength()
	{
		String Str="programming";
		System.out.println("no of chars:"+Str.length());
		
	}
	private static void isemptyString()
	{
		String s=new String();
		System.out.println("is an empty string?:"+s.isEmpty());
	}
	private static void isLowerCaseString()
	{
		String s=new String("Programming");
		System.out.println("it is a lower?:"+s.toLowerCase());
	}
	private static void isupperString()
	{
		String s=new String("PROGRAM");
		System.out.println("it is upper case?:"+s.toUpperCase());
	}
	private static void extractString()
	{
		String s=new String("programming");
		System.out.println("extract:"+s.substring(3));
		System.out.println("extract:"+s.substring(6));
		System.out.println("extract:"+s.substring(2, 8));
		System.out.println("extract:"+s.subSequence(4, 8));
	}
	private static void replaceString()
	{
		String s=new String("it is new dress");
		System.out.println("Replaced String:"+s.replaceAll("new","latest"));
				
	}
	private static void SplitString()
	{
		String s=new String("Banglore and Mysore");
		String s1[]=s.split(" ");
		for(String kk:s1)
		{
			System.out.println(kk);
		}
	}
		private static void getCharArray()
		{
			String s=new String("welcome");
			char ch[]=s.toCharArray();
			for(char kk:ch)
			{
				System.out.println(kk);
		    }
		}
		private static void compareString1()
		{
			String s1="javascripted";
			String s2="JAVASCRIPT";
			System.out.println("s1 and s2 are equal:"+s1.equals(s2));
			System.out.println("s1 and s2 are equal:"+s1.equalsIgnoreCase(s2));
	}

}
