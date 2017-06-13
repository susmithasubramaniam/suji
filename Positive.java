import java.io.*;
import java.util.*;
class Positive{
	public static void main (String[] args) 
	{
	 Scanner s=new Scanner(System.in);
	 int num=s.nextInt();
	 if(num>0){
	 System.out.print(num + "is a positive number");
	 }
	 else if(num<0){
	 System.out.print(num + "is a negative value");
	 }
	 else{
	 System.out.print(num + "is neither positive nor negative");
	 }
	}
}
