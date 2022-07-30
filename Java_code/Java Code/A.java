import java.util.*;
class A{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int Hurl_Factor = sc.nextInt();
	int Spin_Factor= sc.nextInt();
	int Speed_Factor= sc.nextInt();
	int grade;
	if(Hurl_Factor == Spin_Factor == Speed_Factor){
	grade = 10;
        }
	else if(Hurl_Factor == Spin_Factor ){
	grade = 9;
        }
	else if(Spin_Factor == Speed_Factor){
	grade = 8;
        }
	else if(Hurl_Factor == Speed_Factor){
	grade = 7;
        }
	else if(Hurl_Factor || Spin_Factor || Speed_Factor){
	grade = 6;
	else{
	grade = 5;
	}
 }
}