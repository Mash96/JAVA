class step{
	public static void main(String[]args){
		int steps=Integer.parseInt(args[0]);
		int i,j,m,n;
		int count=5;
		
		int sp1=38;
		int sp2=32;
		while(count>0){
			if (count==steps){
				for(n=0;n<(sp2+3);n++){
					System.out.print(" ");
				}
				System.out.print("0");
				for(n=0;n<2;n++){
					System.out.print(" ");
				}
				System.out.println("*");
				///////////////////////////////////////
				for(n=0;n<(sp2+2);n++){
					System.out.print(" ");
				}
				System.out.print("/");
				System.out.print("|");
				System.out.print("\\");
				for(n=0;n<1;n++){
					System.out.print(" ");
				}
				System.out.println("*");
				/////////////////////////////////////////
				for(n=0;n<(sp2+3);n++){
					System.out.print(" ");
				}
				System.out.print("|");
				for(n=0;n<2;n++){
					System.out.print(" ");
				}
				System.out.println("*");
				////////////////////////////////////////
				for(n=0;n<(sp2+2);n++){
					System.out.print(" ");
				}
				System.out.print("/");
				System.out.print(" ");
				System.out.print("\\");
				for(n=0;n<1;n++){
					System.out.print(" ");
				}
				System.out.println("*");
				////////////////////////////////////////
				
				for(n=0;n<(sp2);n++){
					System.out.print(" ");
				}
			    for(i=0;i<4;i++){
				System.out.print("* ");
				}
				System.out.println();
			}
			
			else{
					
				for(i=0;i<4;i++){
					for(j=0;j<sp1;j++){
						System.out.print(" ");
					}
					System.out.println("*");
				}
			
				
				for(m=0;m<sp2;m++){
					System.out.print(" ");
				}
			
				
				for(i=0;i<4;i++){
					System.out.print("* ");
				}
				System.out.println();
			}
			sp1=sp1-8;
			sp2=sp2-8;
			count=count-1;
			
		
				
		}
		
	}
}

