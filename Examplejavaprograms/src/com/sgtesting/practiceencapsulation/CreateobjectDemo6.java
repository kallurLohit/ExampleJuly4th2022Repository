package com.sgtesting.practiceencapsulation;
class Hardware
{
	String hardwarename;
	int hardwareid;
	String shopname;
}
class Software
{
	String softwarename;
	int softwareid;
	String shopname;
}

public class CreateobjectDemo6 {

	public static void main(String[] args) {
		Hardware ram=new Hardware();
		ram.hardwarename="Ram";
		ram.hardwareid=46;
		ram.shopname="sangeeta";
		System.out.println("hardware name:"+ram.hardwarename+" hardwareid:"+ram.hardwareid+" shopname:"+ram.shopname);
		System.out.println("++++++++++++++++++++++");
		Software browser=new Software();
		browser.softwarename="browser";
		browser.softwareid=65;
		browser.shopname="sangeeta";
		System.out.println("software name:"+browser.softwarename+" softwareid:"+browser.softwareid+" shopname:"+browser.shopname);
		System.out.println("+++++++++++++++++++++++++++");

	}

}
