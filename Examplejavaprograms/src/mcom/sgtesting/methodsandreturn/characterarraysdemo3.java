package mcom.sgtesting.methodsandreturn;
class integer8
{
	char[][] arrays3()
	{
		char b[][]= {{'a','b','c'},{'e','f','g'}};
		return b;
	}
}

public class characterarraysdemo3 {

	public static void main(String[] args) {
       integer8 obj1=new integer8();
       char d[][]=obj1.arrays3();
       for(char k[]:d)
       {
    	   for(char z:k)
    	   {
    		   System.out.println(z);
    	   }
       }
	}

}
