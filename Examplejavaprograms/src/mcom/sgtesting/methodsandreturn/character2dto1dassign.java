package mcom.sgtesting.methodsandreturn;
class Character1
{
	char[] arrays2(char d[][])
	{
		char c[]=new char[d.length*d[0].length];
		int n=0;
		for(int i=0;i<=d.length-1;i++)
		{
			for(int j=0;j<=d[0].length-1;j++)
			{
				c[n]=d[i][j];
				n++;
			}
		}
		return c;
	}
}

public class character2dto1dassign {

	public static void main(String[] args) {
		 Character1 obj1=new  Character1();
		 char d[][]= {{'a','b','c'},{'e','f','g'}};
		 char f[]=obj1.arrays2(d);
		 for(int kk:f)
		 {
			 System.out.print(kk+"  ");
			 
		 }
		 System.out.println();

	}

}
