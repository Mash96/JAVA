import java.util.Scanner;
class date{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the date:");
	String da=sc.next();
	String fir=da.substring(0,6);
	String la=da.substring(6);
	System.out.println(" "+fir+"19"+la);
	}
}