package mcom.sgtesting.methodsandreturn;
class integer
{
	int[] getelememts()
			{
		      int a[]= {10,20,30,40,50,60};
		      return a;
			}
}

public class integerarray {
	public static void main(String[] args) {
		integer obj1=new integer();
	    int c[]=obj1.getelememts();
		for(int kk:c)
		{
			System.out.println(kk);
		}
	}

}
