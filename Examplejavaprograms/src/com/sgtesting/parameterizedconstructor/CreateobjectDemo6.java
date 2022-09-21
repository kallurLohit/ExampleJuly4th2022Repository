package com.sgtesting.parameterizedconstructor;
class Hardware
{
	String hardwarename;
	int hardwareid;
	String shopname;
	
	Hardware(String Hn,int hi,String Sn)
	{
		hardwarename=Hn;
		hardwareid=hi;
		shopname=Sn;
		System.out.println("hardware name:"+hardwarename+" hardwareid:"+hardwareid+" shopname:"+shopname);
		System.out.println("++++++++++++++++++++++");	
	}
}
class Software
{
	String softwarename;
	int softwareid;
	String shopname;
	
	Software(String Sn,int Si,String Sp)
	{
		softwarename=Sn;
		softwareid=Si;
		shopname=Sp;
		System.out.println("software name:"+softwarename+" softwareid:"+softwareid+" shopname:"+shopname);
		System.out.println("+++++++++++++++++++++++++++");
	
	}
}

public class CreateobjectDemo6 {

	public static void main(String[] args) {
		Hardware ram=new Hardware("ram",46,"sangeeta");
		
		Software browser=new Software("browser",65,"sangeeta");
		
	}

}
