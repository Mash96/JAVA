import java.util.Scanner;
class comp{
	public static void main(String[]args){
		int i;
		String arr[]=new String[3];
		Scanner sc=new Scanner(System.in);
		System.out.print("enter:");
		String s1=sc.next();
		System.out.print("enter:");
		String s2=sc.next();
		System.out.print("enter:");
		String s3=sc.next();
		if(s1.compareTo(s2)>0 & s1.compareTo(s3)>0){
			arr[0]=s1;
			if(s2.compareTo(s3)>0){
				arr[1]=s2;
				arr[2]=s3;
			}
			else{
				arr[1]=s3;
				arr[2]=s2;
			}
		}
		else if(s2.compareTo(s1)>0 & s2.compareTo(s3)>0){
			arr[0]=s2;
			if(s1.compareTo(s3)>0){
				arr[1]=s1;
				arr[2]=s3;
			}
			else{
				arr[1]=s3;
				arr[2]=s1;
			}
		}
		else{
			arr[0]=s3;
			if(s2.compareTo(s1)>0){
				arr[1]=s2;
				arr[2]=s1;
			}
			else{
				arr[1]=s1;
				arr[2]=s2;
			}
		}
		
		System.out.println(arr[2]+","+arr[1]+","+arr[0]);
		}
	
}