import java.util.*;
class Scooter_gain{
	public static void main(String[] args){
	int a,b,c;
	double res;
	Scanner sc = new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	res=((c-a-b)*1.0/(a+b))*100;
	System.out.println(res);
 }
}