package com.sgtesting.parameterizedconstructor;
class Fruits
{
	   String fruitname;
	   int fruitcost;
	   String cityname;
	   
	   Fruits(String Fn,int Fc,String Cn)
	   
	   {
		   fruitname=Fn;
		   fruitcost=Fc;
		   cityname=Cn;
			System.out.println("fruit name:"+fruitname+"cost:"+fruitcost+"cityname:"+cityname);
			System.out.println("++++++++++++++");   
	   }
}
class Vegitables
{
	  String vegitablename;
	  int vegitablecost;
	  String cityname;
	  
	  Vegitables(String Vn,int vc,String cn)
	  {
		    vegitablename=Vn;
			vegitablecost=vc;
			cityname=cn;
			System.out.println("vegitable name:"+vegitablename+"cost:"+vegitablecost+"cityname:"+cityname);
			System.out.println("++++++++++++++++++");  
	  }
}
class Flowers
{
	  String flowername;
	  int flowercost;
	  String cityname;
	  
	  Flowers(String Fn,int Fc,String Cn)
	  {
		    flowername=Fn;
			flowercost=Fc;
			cityname=Cn;
			System.out.println("flowe name:"+flowername+"cost:"+flowercost+"cityname:"+cityname);
			System.out.println("+++++++++++++++++++++");  
	  }
}


public class createobjectdemo1 {

	public static void main(String[] args) {
		Fruits obj1=new Fruits("apple",25,"mumbai");
		
		Vegitables obj2=new Vegitables("cucumber",25,"gulbarga");
		
		Flowers obj3=new Flowers("lilly",55,"banglore");
		
		

	}

}
