import java.util.Scanner;
class month1{
	public static void main(String[]args){
		int month_num=-1;
		String first3letter;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a month:");
		String month=sc.next();
		System.out.println("You entered "+month);
		first3letter=month.substring(0,3);
		first3letter=first3letter.toUpperCase();
		System.out.println("It's abbreviation is "+first3letter);
		
		if (first3letter.equals("JAN"))
			month_num = 1;
		if(first3letter.equals("FEB"))
			month_num = 2;
		if(first3letter.equals("MAR"))
			month_num = 3;
		if(first3letter.equals("APR"))
			month_num = 4;
		if(first3letter.equals("MAY"))
			month_num = 5;
		if(first3letter.equals("JUN"))
			month_num = 6;
		if(first3letter.equals("JUL"))
			month_num = 7;
		if(first3letter.equals("AUG"))
			month_num = 8;
		if(first3letter.equals("SEP"))
			month_num = 9;
		if(first3letter.equals("OCT"))
			month_num = 10;
		if(first3letter.equals("NOV"))
			month_num = 11;
		if(first3letter.equals("DEC"))
			month_num = 12;
		
		System.out.println("This is month number "+ month_num);
		
	}
}