package com.sgtesting.noargsconstructor;
class Animals
{
	String animalname;
	String animalbreed;
	String classname;
	
	Animals()
	{
		animalname="tiger";
		animalbreed="bengal tiger";
		classname="mammalia";
		System.out.println("animal name:"+animalname+" aniamalbreed:"+animalbreed+" clasname:"+classname);
		System.out.println("++++++++++++++++++++");	
	}
	
}
class birds
{
	String birdname;
	String birdbreed;
	String classname;
	
	birds()
	{
		birdname="parrot";
		birdbreed="african grey parrot";
		classname="reptiles";
		System.out.println("bird name:"+birdname+" birdbreed:"+birdbreed+" classname:"+classname);
		System.out.println("++++++++++++++++");	
	}
}
class insects
{
	String insectname;
	String insectbreed;
	String classname;
	
	insects()
	{
		insectname="ant";
		insectbreed="carpenter ants";
		classname="insecta";
		System.out.println("insect name:"+insectname+" insectbreed:"+insectbreed+" classnmae:"+classname);
		System.out.println("+++++++++++++++++++++");
			
	}
}

public class createobjectdemo4 {

	public static void main(String[] args) {
		Animals obj1=new Animals();
		
		birds obj2=new birds();
	
		insects obj3=new insects();
		
		
		
		
				
		
		
		
	
		

	}

}
