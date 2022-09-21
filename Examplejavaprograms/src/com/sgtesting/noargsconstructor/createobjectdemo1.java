package com.sgtesting.noargsconstructor;
class Fruits
{
	   String fruitname;
	   int fruitcost;
	   String cityname;
	   
	   Fruits()
	   
	   {
		   fruitname="apple";
		   fruitcost=25;
		   cityname="mumbai";
			System.out.println("fruit name:"+fruitname+"cost:"+fruitcost+"cityname:"+cityname);
			System.out.println("++++++++++++++");   
	   }
}
class Vegitables
{
	  String vegitablename;
	  int vegitablecost;
	  String cityname;
	  
	  Vegitables()
	  {
		    vegitablename="cucumber";
			vegitablecost=25;
			cityname="gulabarga";
			System.out.println("vegitable name:"+vegitablename+"cost:"+vegitablecost+"cityname:"+cityname);
			System.out.println("++++++++++++++++++");  
	  }
}
class Flowers
{
	  String flowername;
	  int flowercost;
	  String cityname;
	  
	  Flowers()
	  {
		    flowername="lilly";
			flowercost=55;
			cityname="banglore";
			System.out.println("flowe name:"+flowername+"cost:"+flowercost+"cityname:"+cityname);
			System.out.println("+++++++++++++++++++++");  
	  }
}
public class createobjectdemo1 {

	public static void main(String[] args) {
		Fruits obj1=new Fruits();
		Vegitables obj2=new Vegitables();	
		Flowers obj3=new Flowers();
		}
}
