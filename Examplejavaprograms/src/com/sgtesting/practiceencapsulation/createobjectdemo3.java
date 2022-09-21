package com.sgtesting.practiceencapsulation;
class Twowheeler
{
	String vechilename;
	int vechilecost;
	int noofwheels;
}
class Fourwheeler
{
	String vechilename;
	int vechilecost;
	int noofwheels;
}
class Heavyvechile
{
	String vechilename;
	int vechilecost;
	int noofwheels;
}


public class createobjectdemo3 {

	public static void main(String[] args) {
		Twowheeler obj1=new Twowheeler();
		obj1.vechilename="hero";
		obj1.vechilecost=150000;
		obj1.noofwheels=2;
		System.out.println("vechile name:"+obj1.vechilename+"cost:"+obj1.vechilecost+"noofwheels:"+obj1.noofwheels);
		System.out.println("+++++++++++++++++++");
		Fourwheeler obj2=new Fourwheeler();
		obj2.vechilename="Santro car";
		obj2.vechilecost=2400000;
		obj2.noofwheels=4;
		System.out.println("vechile name:"+obj2.vechilename+"cost:"+obj2.vechilecost+"noofwheels:"+obj2.noofwheels);
		System.out.println("+++++++++++++++++++++++");
		
        Heavyvechile obj3=new Heavyvechile();
        obj3.vechilename="bus";
        obj3.vechilecost=8000000;
        obj3.noofwheels=16;
        System.out.println("vechile name:"+obj3.vechilename+"cost:"+obj3.vechilecost+"noofwheels:"+obj3.noofwheels);
        System.out.println("+++++++++++++++++++");
        
	}

}
