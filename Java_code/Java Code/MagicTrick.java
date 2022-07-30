/* package codechef; // don't place package name! */
 
import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class MagicTrick
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int t;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		while(t>0){
		    int n;
		    float v1,v2;
		    n=sc.nextInt();
		    v1=sc.nextFloat();
		    v2=sc.nextFloat();
		    if((1.41*n)/v1>(2*n)/v2){
		        System.out.println("Elevator");
		    }
		    else{
		        System.out.println("Stairs");
		    }
		    t--;
		}
	}
}