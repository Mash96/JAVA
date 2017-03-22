import java.util.Random;
class sum3{
    public static void main(String[]args){
        int i,sum=0;
        Random rand=new Random();
        int n=rand.nextInt(9999)+1;
        System.out.println("n ="+ n);
        for(i=1;i<(n+1);i++){
            sum+=(1/(i*i));
        }
        System.out.println("Sum =" + sum);
        float eq= ((22/7)*(22/7)/6);
        System.out.println("(22/7)*(22/7)/6 ="+ eq);
        
    }
}
