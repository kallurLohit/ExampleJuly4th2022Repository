package com.sgtesting.noargsconstructor;
class country
{
	String countryname;
	int population;
	int noofstates;
	
	country()
	{
		countryname="india";
		population=1200000000;
		noofstates=28;
		System.out.println("country name:"+countryname+"poulation:"+population+"noofstates:"+noofstates);
		System.out.println("++++++++++++++++++++++");	
	}
}
class state
{
	String statename;
	int population;
	int noofdistricts;
	
	state()
	{
		statename="karnataka";
		population=64100000;
		noofdistricts=31;
		System.out.println("state name:"+statename+" population:"+population+" noofdistrict:"+noofdistricts);
		System.out.println("+++++++++++++++++++++++");		
	}
}
class village
{
	String villagename;
	int population;
	int noofhouses;
	
	village()
	{
		villagename="kallur";
		population=5000;
		noofhouses=500;
		System.out.println("village name:"+villagename+" population:"+population+" noofhouse:"+noofhouses);
		System.out.println("+++++++++++++++++++++++");
			
	}
}

public class createobjectdemo5 {

	public static void main(String[] args) {
		country india=new country();
		
		state karnataka=new state();
		
		village kallur=new village();
		

	}

}
