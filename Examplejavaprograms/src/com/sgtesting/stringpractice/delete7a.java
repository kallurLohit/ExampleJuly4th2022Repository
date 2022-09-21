package com.sgtesting.stringpractice;

public class delete7a {

	public static void main(String[] args) {
		DeleteString();
        
	}
	private static void DeleteString()
	{
		String s=new String("SUNDAYMONDAYTUESDAYWEDDNSDAYTHURSDAYFRIDAYSATURDAY");
		String s1[]=s.split("DAY");
		for(String kk:s1)
		{
			System.out.println(kk);
		}
	}

}
