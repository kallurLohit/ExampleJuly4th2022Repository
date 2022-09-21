package com.sgtesting.noargsconstructor;
class Twowheeler
{
	String vechilename;
	int vechilecost;
	int noofwheels;
	
	Twowheeler()
	{
		vechilename="hero";
		vechilecost=150000;
		noofwheels=2;
		System.out.println("vechile name:"+vechilename+"cost:"+vechilecost+"noofwheels:"+noofwheels);
		System.out.println("+++++++++++++++++++");	
	}
}
class Fourwheeler
{
	String vechilename;
	int vechilecost;
	int noofwheels;
	
	Fourwheeler()
	{
		vechilename="Santro car";
		vechilecost=2400000;
		noofwheels=4;
		System.out.println("vechile name:"+vechilename+"cost:"+vechilecost+"noofwheels:"+noofwheels);
		System.out.println("+++++++++++++++++++++++");	
	}
}
class Heavyvechile
{
	String vechilename;
	int vechilecost;
	int noofwheels;
	
	Heavyvechile()
	{
		    vechilename="bus";
	        vechilecost=8000000;
	        noofwheels=16;
	        System.out.println("vechile name:"+vechilename+"cost:"+vechilecost+"noofwheels:"+noofwheels);
	        System.out.println("+++++++++++++++++++");	
	}
}


public class createobjectdemo3 {

	public static void main(String[] args) {
		Twowheeler obj1=new Twowheeler();
		
		Fourwheeler obj2=new Fourwheeler();
		
		
        Heavyvechile obj3=new Heavyvechile();
       
	}

}
