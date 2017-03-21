import java.util.Random;
class Ramin{
	public static void main(String[]args){
	Random rand1=new Random();
	int n1=rand1.nextInt(100);
	Random rand2=new Random();
	int n2=rand2.nextInt(100);
	if(n2<n1){
		System.out.println("minimum is n2");
	}
	else{
		System.out.println("minimum is n1");
	}
	}
}