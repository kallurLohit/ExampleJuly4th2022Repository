package com.sgtesting.inheritenceassignments;
class Software
{
	Software(String companyname)
	{
		System.out.println("name of copany:"+companyname);
    }
	Software(String city,int pincode)
	{
		System.out.println("name of city:"+city+"pincode:"+pincode);
	}
}
class Browser extends Software
{
	Browser(String cn)
	{
		super(cn);
	}
	Browser(String ci,int pc)
	{
		super(ci,pc);
	}
}
class Os extends Software
{
	Os(String cn)
	{
	super(cn);
    }
Os(String ci,int pc)
   {
	super(ci,pc);
   }
}

public class Hirarchlesuperclass {

	public static void main(String[] args) {
     Browser obj=new Browser("TCS");
     Browser obj2=new Browser("banglore",584000);
     Os obj3=new Os("bata");
     Os obj4=new Os("gulbarga",585308);
	}

}
