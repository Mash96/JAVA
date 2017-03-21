class String_{
	public static void main(String []args){
	String s=new String("Call me Tharaka");
	System.out.println(s);
	System.out.println(s.length());
	System.out.println(s.charAt(0));
	System.out.println(s.charAt(s.length()-1));
	System.out.print(s.substring((s.indexOf("C")),(s.indexOf("m"))));

	}
}