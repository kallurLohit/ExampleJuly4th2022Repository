package com.sgtesting.practiceencapsulation;
class Animals
{
	String animalname;
	String animalbreed;
	String classname;
}
class birds
{
	String birdname;
	String birdbreed;
	String classname;
}
class insects
{
	String insectname;
	String insectbreed;
	String classname;
}

public class createobjectdemo4 {

	public static void main(String[] args) {
		Animals obj1=new Animals();
		obj1.animalname="tiger";
		obj1.animalbreed="bengal tiger";
		obj1.classname="mammalia";
		System.out.println("animal name:"+obj1.animalname+" aniamalbreed:"+obj1.animalbreed+" clasname:"+obj1.classname);
		System.out.println("++++++++++++++++++++");
		birds obj2=new birds();
		obj2.birdname="parrot";
		obj2.birdbreed="african grey parrot";
		obj2.classname="reptiles";
		System.out.println("bird name:"+obj2.birdname+" birdbreed:"+obj2.birdbreed+" classname:"+obj2.classname);
		System.out.println("++++++++++++++++");
		insects obj3=new insects();
		obj3.insectname="ant";
		obj3.insectbreed="carpenter ants";
		obj3.classname="insecta";
		System.out.println("insect name:"+obj3.insectname+" insectbreed:"+obj3.insectbreed+" classnmae:"+obj3.classname);
		System.out.println("+++++++++++++++++++++");
		
		
		
				
		
		
		
	
		

	}

}
