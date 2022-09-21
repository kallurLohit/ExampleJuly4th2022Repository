package com.sgtesting.parameterizedconstructor;
class Animals
{
	String animalname;
	String animalbreed;
	String classname;
	
	Animals(String An,String Ab,String Cn)
	{
		animalname=An;
		animalbreed=Ab;
		classname=Cn;
		System.out.println("animal name:"+animalname+" aniamalbreed:"+animalbreed+" clasname:"+classname);
		System.out.println("++++++++++++++++++++");	
	}
	
}
class birds
{
	String birdname;
	String birdbreed;
	String classname;
	
	birds(String Bn,String Bb,String Cn)
	{
		birdname=Bn;
		birdbreed=Bb;
		classname=Cn;
		System.out.println("bird name:"+birdname+" birdbreed:"+birdbreed+" classname:"+classname);
		System.out.println("++++++++++++++++");	
	}
}
class insects
{
	String insectname;
	String insectbreed;
	String classname;
	
	insects(String In,String Ib,String Cn)
	{
		insectname=In;
		insectbreed=Ib;
		classname=Cn;
		System.out.println("insect name:"+insectname+" insectbreed:"+insectbreed+" classnmae:"+classname);
		System.out.println("+++++++++++++++++++++");
			
	}
}

public class createobjectdemo4 {

	public static void main(String[] args) {
		Animals obj1=new Animals("tiger","bengal tiger","memaliya");
		
		birds obj2=new birds("parrot","african grey parrot","reptiles");
	
		insects obj3=new insects("ant","carpenter ants","insecta");
		
		
		
		
				
		
		
		
	
		

	}

}
