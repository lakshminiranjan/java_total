import java.util.Scanner;
class Main{
	public static void main(String[] args){
	int l,n,i=1,m=0,a;
	Scanner sc = new Scanner(System.in);
	l=sc.nextInt();
	n=sc.nextInt();
	while(i*i<=n){
		m=i*i;
		i++;
	} 
	a=m*(l*l);
	System.out.println(a);
 }
}