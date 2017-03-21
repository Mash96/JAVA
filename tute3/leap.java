import java.util.Random;
class leap{
	public static void main(String[]args){
		Random rand=new Random();
		int x=rand.nextInt(2000)+1800;
		int year=Math.round(200*x+1800);
		if(year%400==0 | year%4==0 & year%100!=0){
			System.out.println("it is a leap year");
		}
		else
			System.out.println("it is not a leap year");
	}
}