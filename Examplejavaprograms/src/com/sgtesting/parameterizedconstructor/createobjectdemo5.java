package com.sgtesting.parameterizedconstructor;
class country
{
	String countryname;
	int population;
	int noofstates;
	
	country(String Cn,int Pn,int Nf)
	{
		countryname=Cn;
		population=Pn;
		noofstates=Nf;
		System.out.println("country name:"+countryname+"poulation:"+population+"noofstates:"+noofstates);
		System.out.println("++++++++++++++++++++++");	
	}
}
class state
{
	String statename;
	int population;
	int noofdistricts;
	
	state(String Sn,int Pn,int Nd)
	{
		statename=Sn;
		population=Pn;
		noofdistricts=Nd;
		System.out.println("state name:"+statename+" population:"+population+" noofdistrict:"+noofdistricts);
		System.out.println("+++++++++++++++++++++++");		
	}
}
class village
{
	String villagename;
	int population;
	int noofhouses;
	
	village(String Vn,int Pn,int Nh)
	{
		villagename=Vn;
		population=Pn;
		noofhouses=Nh;
		System.out.println("village name:"+villagename+" population:"+population+" noofhouse:"+noofhouses);
		System.out.println("+++++++++++++++++++++++");
			
	}
}

public class createobjectdemo5 {

	public static void main(String[] args) {
		country india=new country("india",1200000000,28);
		
		state karnataka=new state("karnataka",64100000,31);
		
		village kallur=new village("kallur",5000,500);
		

	}

}
