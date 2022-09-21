package com.sgtesting.noargsconstructor;
class Hardware
{
	String hardwarename;
	int hardwareid;
	String shopname;
	
	Hardware()
	{
		hardwarename="Ram";
		hardwareid=46;
		shopname="sangeeta";
		System.out.println("hardware name:"+hardwarename+" hardwareid:"+hardwareid+" shopname:"+shopname);
		System.out.println("++++++++++++++++++++++");	
	}
}
class Software
{
	String softwarename;
	int softwareid;
	String shopname;
	
	Software()
	{
		softwarename="browser";
		softwareid=65;
		shopname="sangeeta";
		System.out.println("software name:"+softwarename+" softwareid:"+softwareid+" shopname:"+shopname);
		System.out.println("+++++++++++++++++++++++++++");
	
	}
}

public class CreateobjectDemo6 {

	public static void main(String[] args) {
		Hardware ram=new Hardware();
		
		Software browser=new Software();
		
	}

}
