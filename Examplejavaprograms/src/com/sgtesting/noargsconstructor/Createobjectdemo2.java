package com.sgtesting.noargsconstructor;
class laptop
{
	String laptopname;
	int laptopcost;
	String ownername;
	
	laptop()
	{
		laptopname="dell";
		laptopcost=25000;
		ownername="lohit";
		System.out.println("laptop:"+laptopname+" cost:"+laptopcost+" ownername:"+ownername);
		System.out.println("++++++++++++++++++++++++");	
	}
}
class desktop
{
	String desktopname;
	int desktopcost;
	String desktopvendor;
	
	desktop()
	{
		desktopname="windows";
		desktopcost=5000;
		desktopvendor="ms office";
		System.out.println("desktop name:"+desktopname+"cost:"+desktopcost+"desktopvendor:"+desktopvendor);
		System.out.println("++++++++++++++++++++++++++");	
	}
}
class Mobile
{
	String mobilename;
	int mobilecost;
	String mobilecompany;
	
	Mobile()
	{
		mobilename="Apple";
		mobilecost=55000;
		mobilecompany="apple";
		System.out.println("moboile name:"+mobilename+"cost:"+mobilecost+"mobile company:"+mobilecompany);
		System.out.println("+++++++++++++++++++++++");	
	}
}

public class Createobjectdemo2 {

	public static void main(String[] args) {
		laptop obj1=new laptop();
		
		desktop obj2=new desktop();
	
		Mobile obj3=new Mobile();
		
		

	}

}
