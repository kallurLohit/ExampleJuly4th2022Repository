package com.sgtesting.parameterizedconstructor;
class laptop
{
	String laptopname;
	int laptopcost;
	String ownername;
	
	laptop(String Ln,int Lc,String On)
	{
		laptopname=Ln;
		laptopcost=Lc;
		ownername=On;
		System.out.println("laptop:"+laptopname+" cost:"+laptopcost+" ownername:"+ownername);
		System.out.println("++++++++++++++++++++++++");	
	}
}
class desktop
{
	String desktopname;
	int desktopcost;
	String desktopvendor;
	
	desktop(String Dn,int Dc,String Dv)
	{
		desktopname=Dn;
		desktopcost=Dc;
		desktopvendor=Dv;
		System.out.println("desktop name:"+desktopname+"cost:"+desktopcost+"desktopvendor:"+desktopvendor);
		System.out.println("++++++++++++++++++++++++++");	
	}
}
class Mobile
{
	String mobilename;
	int mobilecost;
	String mobilecompany;
	
	Mobile(String Mn,int Mc,String My)
	{
		mobilename=Mn;
		mobilecost=Mc;
		mobilecompany=My;
		System.out.println("moboile name:"+mobilename+"cost:"+mobilecost+"mobile company:"+mobilecompany);
		System.out.println("+++++++++++++++++++++++");	
	}
}

public class Createobjectdemo2 {

	public static void main(String[] args) {
		laptop obj1=new laptop("dell",250000,"lohit");
		
		desktop obj2=new desktop("windows",5000,"ms office");
	
		Mobile obj3=new Mobile("Apple",55000,"apple");
		
		

	}

}
