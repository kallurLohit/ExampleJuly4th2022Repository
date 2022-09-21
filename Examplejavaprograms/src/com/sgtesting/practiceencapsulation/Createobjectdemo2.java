package com.sgtesting.practiceencapsulation;
class laptop
{
	String laptopname;
	int laptopcost;
	String ownername;
}
class desktop
{
	String desktopname;
	int desktopcost;
	String desktopvendor;
}
class Mobile
{
	String mobilename;
	int mobilecost;
	String mobilecompany;
}

public class Createobjectdemo2 {

	public static void main(String[] args) {
		laptop obj1=new laptop();
		obj1.laptopname="dell";
		obj1.laptopcost=25000;
		obj1.ownername="lohit";
		System.out.println("laptop:"+obj1.laptopname+" cost:"+obj1.laptopcost+" ownername:"+obj1.ownername);
		System.out.println("++++++++++++++++++++++++");
		desktop obj2=new desktop();
		obj2.desktopname="windows";
		obj2.desktopcost=5000;
		obj2.desktopvendor="ms office";
		System.out.println("desktop name:"+obj2.desktopname+"cost:"+obj2.desktopcost+"desktopvendor:"+obj2.desktopvendor);
		System.out.println("++++++++++++++++++++++++++");
		Mobile obj3=new Mobile();
		obj3.mobilename="Apple";
		obj3.mobilecost=55000;
		obj3.mobilecompany="apple";
		System.out.println("moboile name:"+obj3.mobilename+"cost:"+obj3.mobilecost+"mobile company:"+obj3.mobilecompany);
		System.out.println("+++++++++++++++++++++++");
		

	}

}
