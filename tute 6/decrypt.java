

class decrypt{
	public static void main(String args[]){
		char[] word = args[0].toCharArray();
		String n="";
		//read the string letter by letter
		
		
		for(int i=0;i<word.length;i++){
			if(word[i]=='A')
				n=n+"Z";
			if(word[i]=='B')
				n=n+"Y";
			if(word[i]=='C')
				n=n+"X";
			if(word[i]=='D')
				n=n+"W";
			if(word[i]=='E')
				n=n+"V";
			if(word[i]=='F')
				n=n+"U";
			if(word[i]=='G')
				n=n+"T";
			if(word[i]=='H')
				n=n+"S";
			if(word[i]=='I')
				n=n+"R";
			if(word[i]=='J')
				n=n+"Q";
			if(word[i]=='K')
				n=n+"P";
			if(word[i]=='L')
				n=n+"O";
			if(word[i]=='M')
				n=n+"N";
			if(word[i]=='N')
				n=n+"M";
			if(word[i]=='O')
				n=n+"L";
			if(word[i]=='P')
				n=n+"K";
			if(word[i]=='Q')
				n=n+"J";
			if(word[i]=='R')
				n=n+"I";
			if(word[i]=='S')
				n=n+"H";
			if(word[i]=='T')
				n=n+"G";
			if(word[i]=='U')
				n=n+"F";
			if(word[i]=='V')
				n=n+"E";
			if(word[i]=='W')
				n=n+"D";
			if(word[i]=='X')
				n=n+"C";
			if(word[i]=='Y')
				n=n+"B";
			if(word[i]=='Z')
				n=n+"A";
		}
		System.out.println(n);
	}
}
			
			
	
	