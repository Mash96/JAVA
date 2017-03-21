import java.util.Scanner;
class month2{
	public static void main(String[]args){
		int n=-1;
		String first3letter;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a month:");
		String month=sc.next();
		System.out.println("You entered "+month);
		first3letter=month.substring(0,3);
		first3letter=first3letter.toUpperCase();
		System.out.println("It's abbreviation is "+first3letter);
		
		if (first3letter.equals("JAN"))n = 1;
		if(first3letter.equals("FEB"))n = 2;
		if(first3letter.equals("MAR"))n = 3;
		if(first3letter.equals("APR"))n = 4;
		if(first3letter.equals("MAY"))n = 5;
		if(first3letter.equals("JUN"))n = 6;
		if(first3letter.equals("JUL"))n = 7;
		if(first3letter.equals("AUG"))n = 8;
		if(first3letter.equals("SEP"))n = 9;
		if(first3letter.equals("OCT"))n = 10;
		if(first3letter.equals("NOV"))n = 11;
		if(first3letter.equals("DEC"))n = 12;
		
		System.out.println("This is month number "+ n);
		
	}
}