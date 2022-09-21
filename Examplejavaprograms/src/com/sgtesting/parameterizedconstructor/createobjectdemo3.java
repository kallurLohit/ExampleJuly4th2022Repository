package com.sgtesting.parameterizedconstructor;
class Twowheeler
{
	String vechilename;
	int vechilecost;
	int noofwheels;
	
	Twowheeler(String Vn,int Vc,int Nw)
	{
		vechilename=Vn;
		vechilecost=Vc;
		noofwheels=Nw;
		System.out.println("vechile name:"+vechilename+"cost:"+vechilecost+"noofwheels:"+noofwheels);
		System.out.println("+++++++++++++++++++");	
	}
}
class Fourwheeler
{
	String vechilename;
	int vechilecost;
	int noofwheels;
	
	Fourwheeler(String Vn,int Vc,int Nw)
	{
		vechilename=Vn;
		vechilecost=Vc;
		noofwheels=Nw;
		System.out.println("vechile name:"+vechilename+"cost:"+vechilecost+"noofwheels:"+noofwheels);
		System.out.println("+++++++++++++++++++++++");	
	}
}
class Heavyvechile
{
	String vechilename;
	int vechilecost;
	int noofwheels;
	
	Heavyvechile(String vn,int vc,int nw)
	{
		    vechilename=vn;
	        vechilecost=vc;
	        noofwheels=nw;
	        System.out.println("vechile name:"+vechilename+"cost:"+vechilecost+"noofwheels:"+noofwheels);
	        System.out.println("+++++++++++++++++++");	
	}
}


public class createobjectdemo3 {

	public static void main(String[] args) {
		Twowheeler obj1=new Twowheeler("hero",1500000,2);
		
		Fourwheeler obj2=new Fourwheeler("car",2500000,4);
		
		
        Heavyvechile obj3=new Heavyvechile("bus",8000000,16);
       
	}

}
