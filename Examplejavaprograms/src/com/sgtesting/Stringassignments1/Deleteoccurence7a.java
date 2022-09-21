package com.sgtesting.Stringassignments1;

public class Deleteoccurence7a {

	public static void main(String[] args) {
		deleteString();
       
	}
	private static void deleteString()
	{
		StringBuilder s=new StringBuilder("SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY");
		StringBuilder s1=s.delete(3, 6);
		StringBuilder s2=s1.delete(6, 9);
		StringBuilder s3=s2.delete(10, 13);
		StringBuilder s4=s3.delete(16, 19);
		StringBuilder s5=s4.delete(20, 25);
		StringBuilder s6=s5.delete(23, 25);
		StringBuilder s7=s6.delete(28, 30);
		System.out.println("deleted String:"+s7);
		
		//2nd approach
		String o="SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY";
		System.out.println(o.replace("DAy",""));
		
		
		//3rd approach
		String d="SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY";
		char e[]=d.toCharArray();
		for(int i=0;i<=e.length-1;i++)
		{
			if((e[i]=='D')||e[i]=='A'||e[i]=='y')
			{
				continue;
			}
			System.out.print(e[i]);
		}
		System.out.println();
				
		
	}

}
