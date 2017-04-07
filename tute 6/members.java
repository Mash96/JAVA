import java.util.Scanner;
class members{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		int ini_members=1;
		int count=0;
		//if the organization was started in January, the number of members 
		//in the organization up to April
		for(int i=1;i<4;i++){
			ini_members=ini_members*2;
		}
		System.out.println("Initial number of members "+ ini_members);
		System.out.print("Current amount of members:");
		int curr_members=scan.nextInt();
		
		while(curr_members>1){
			curr_members=curr_members/2;
			count+=1;
		}
		System.out.println("number of months: "+ count);
	}
}
		
		
	