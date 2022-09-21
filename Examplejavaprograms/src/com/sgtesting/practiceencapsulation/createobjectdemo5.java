package com.sgtesting.practiceencapsulation;
class country
{
	String countryname;
	int population;
	int noofstates;
}
class state
{
	String statename;
	int population;
	int noofdistricts;
}
class village
{
	String villagename;
	int population;
	int noofhouses;
}

public class createobjectdemo5 {

	public static void main(String[] args) {
		country india=new country();
		india.countryname="india";
		india.population=1200000000;
		india.noofstates=28;
		System.out.println("country name:"+india.countryname+"poulation:"+india.population+"noofstates:"+india.noofstates);
		System.out.println("++++++++++++++++++++++");
		state karnataka=new state();
		karnataka.statename="karnataka";
		karnataka.population=64100000;
		karnataka.noofdistricts=31;
		System.out.println("state name:"+karnataka.statename+" population:"+karnataka.population+" noofdistrict:"+karnataka.noofdistricts);
		System.out.println("+++++++++++++++++++++++");
		village kallur=new village();
		kallur.villagename="kallur";
		kallur.population=5000;
		kallur.noofhouses=500;
		System.out.println("village name:"+kallur.villagename+" population:"+kallur.population+" noofhouse:"+kallur.noofhouses);
		System.out.println("+++++++++++++++++++++++");
		

	}

}
