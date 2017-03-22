import java.util.Random;
class summation3{
	public static void main(String[]args){
	    int i=0,sum=0;
		Random rand=new Random();
		int n=rand.nextInt(99)+1;
		System.out.println("n ="+ n);
		for(i=1;i<n+1;i++){
		    sum=sum+i;
		}
		System.out.println("Sum ="+ sum);
		int eq=((n*n)*((n+1)*(n+1))/4);
		System.out.println("(n*n)*((n+1)*(n+1))/4 ="+ eq);
		
	}
}