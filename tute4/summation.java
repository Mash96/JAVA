import java.util.Random;
class summation{
	public static void main(String[]args){
		int i,sum=0;
		Random rand=new Random();
		int n=rand.nextInt(99)+1;
		System.out.println("n "+ n);
		for(i=1;i<(n+1);i++){
			sum+=i;
		}
		System.out.println("Sum "+ sum);
		int eq=n*(n+1)/2;
		System.out.println("n*(n+1)/2 "+ eq);
	}
}