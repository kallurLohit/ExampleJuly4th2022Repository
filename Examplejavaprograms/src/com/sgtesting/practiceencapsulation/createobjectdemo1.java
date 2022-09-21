package com.sgtesting.practiceencapsulation;
class Fruits
{
	   String fruitname;
	   int fruitcost;
	   String cityname;
}
class Vegitables
{
	  String vegitablename;
	  int vegitablecost;
	  String cityname;
}
class Flowers
{
	  String flowername;
	  int flowercost;
	  String cityname;
}


public class createobjectdemo1 {

	public static void main(String[] args) {
		Fruits obj1=new Fruits();
		obj1.fruitname="apple";
		obj1.fruitcost=25;
		obj1.cityname="mumbai";
		System.out.println("fruit name:"+obj1.fruitname+"cost:"+obj1.fruitcost+"cityname:"+obj1.cityname);
		System.out.println("++++++++++++++");
		
		Vegitables obj2=new Vegitables();
		obj2.vegitablename="cucumber";
		obj2.vegitablecost=25;
		obj2.cityname="gulabarga";
		System.out.println("vegitable name:"+obj2.vegitablename+"cost:"+obj2.vegitablecost+"cityname:"+obj2.cityname);
		System.out.println("++++++++++++++++++");
		
		Flowers obj3=new Flowers();
		obj3.flowername="lilly";
		obj3.flowercost=55;
		obj3.cityname="banglore";
		System.out.println("flowe name:"+obj3.flowername+"cost:"+obj3.flowercost+"cityname:"+obj3.cityname);
		System.out.println("+++++++++++++++++++++");
		
		

	}

}
