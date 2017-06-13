import java.io.*;
import java.util.*;
class Num
{
	public static void main (String[] args)
	{
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	if(num%2==0)
	{
	    System.out.print(num+"is a even number");
	}
	else
	{
	    System.out.print(num+"is a odd");
	}
	}
}
