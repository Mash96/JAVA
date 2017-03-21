import java.util.Scanner;
class tele{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter 10-digit telephone number:");
	String te=sc.next();
	System.out.println("You entered "+te);
	String sc1=te.substring(0,3);
	String sc2=te.substring(3,6);
	String sc3=te.substring(6);
	System.out.println("The area code is "+sc1);
	System.out.println("The exchange is "+sc2);
	System.out.println("The number is "+sc3);
	System.out.println("The complete telephone number is (" +(sc1)+ ") " +(sc2)+ "-" +sc3);
	
	}
}