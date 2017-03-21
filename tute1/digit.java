class digit{
	public static void main(String[]args){
	int n=5814;
	int k=1000;
	int i,j;
	int a[]=new int[5];
	for(i=0;i<4;i++){
		a[i]=n/k;
		n=n%k;
		
		k=k/10;
	}
	for(j=0;j<4;j++){
		System.out.print(" ");
		System.out.print(a[j]);
	}
	}
}