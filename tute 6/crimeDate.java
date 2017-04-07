import java.util.Scanner;
class crimeDate{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		System.out.print("enter the date:");
		int date=scan.nextInt();
		int count=0,i;
		if(date>1 && date<=31){
			for(i=1;i<=date;i++){
				if(date%i==0){
					count+=1;
				}
			}
		}
		
		if(count==2){
			System.out.println("it is a crime date");
		}
		else{
			System.out.println("It is not a crime date");
		}
	}
}
			
		
		
	