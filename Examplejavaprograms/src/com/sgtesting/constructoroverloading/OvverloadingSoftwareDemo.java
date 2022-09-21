package com.sgtesting.constructoroverloading;
class Software
{
	Software(String Sname,int idno)
	{
		System.out.println("software name:"+Sname);
		System.out.println("id number:"+idno);
	}
	Software(String spname)
	{
		System.out.println("shop name:"+spname);	
	}
	Software(int sallery)
	{
		System.out.println("sallery:"+sallery);
	}
}

public class OvverloadingSoftwareDemo {

	public static void main(String[] args) {
		Software o1=new Software("browser",40);
		Software o2=new Software("sangeeta");
		Software o3=new Software(50000);

	}

}
