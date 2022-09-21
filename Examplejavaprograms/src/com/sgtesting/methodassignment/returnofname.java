package com.sgtesting.methodassignment;
class Demo20
{
	String getname(String s)
	{
		return s;
	}
}
	class Demo25
	{
		String getname(String fname,String iname)
		{
			String s=fname+ "  "+iname;
			return s;
		}
	}
	//how to return integer array from method
class Demo30
{
	int[] array()
	{
		int a[]= {3,4,5,6,7};
		return a;
	}
}
//write a method method has to return String array
class Demo35
{
	String[] array20()
	{
		String s[]= {"sun","mon","tue","wed","thu","fri","sat"};
		return s;
	}
}


public class returnofname {

	public static void main(String[] args) {
		 Demo20 k=new  Demo20();
		 String z=k.getname("Lohitkumar");
		 System.out.println(z);
		 Demo25 p=new Demo25();
		 String h=p.getname("lohitkumar", "kallur");
		 System.out.println(h);
		 Demo30 g=new Demo30();
		 int b[]=g.array();
		 for(int kk:b)
		 {
			 System.out.println(kk);
		 }
		 Demo35 kk=new Demo35();
		 String k1[]=kk.array20();
		 for(String zz:k1)
		 {
			 System.out.println(zz);
		 }
		

	}

}
