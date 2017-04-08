class staircase{
	public static void main(String[]args){
		int i,j,m;
		int count=5;
		int sp1=38;
		int sp2=32;
		while(count>0){
			for(i=0;i<4;i++){
				for(j=0;j<sp1;j++){
					System.out.print(" ");
				}
				System.out.println("*");
			}
			
			sp1=sp1-8;
			for(m=0;m<sp2;m++){
				System.out.print(" ");
			}
			sp2=sp2-8;
			
			for(i=0;i<4;i++){
				System.out.print("* ");
			}
			System.out.println();
			count=count-1;
		}
		
	}
}
