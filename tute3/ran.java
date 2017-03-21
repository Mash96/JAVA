import java.util.Random;
class ran{
	public static void main(String[]args){
	int max = 100;
	int min = -100;
	Random rand=new Random();
	int value=rand.nextInt((max-min));
	if(value>0){
		System.out.println("number is possitive");
	}
	else
		System.out.println("number is not possitive");
	}
}
	