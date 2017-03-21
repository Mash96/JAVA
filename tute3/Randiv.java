import java.util.Random;
class Randiv{
	public static void main(String[] args){
		Random rand=new Random();
		int num=rand.nextInt(100);
		if(num%2==0){
			System.out.println("num is deviisible by 2 ");
		}
		else if(num%3==0){
			System.out.println("num is deviisible by 3");
		}
		else if(num%5==0){
			System.out.println("num is deviisible by 5");
		}
		else
			System.out.println("num is not deviisible by 2 0r 3 0r 5");
	}
}