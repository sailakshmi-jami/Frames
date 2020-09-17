package javaprograms;

public class Reverse {

	public static void main(String[] args) {
		/*
		 * String a="sai";
		 *  String b="lakshmi"; 
		 *  System.out.println("before swap:" +a+""+b); 
		 * a=a+b; 
		 * b=a.substring(0, a.length()-b.length());
		 * a=a.substring(b.length());
		 *  System.out.println("after swap:"+a+""+b);
		 */
		String s="selenium";
	
		int len=s.length();
	
		
		  String rev="";
		   for(int i=len-1;i>=0;i--) {
		   rev=rev+s.charAt(i);
		 
		 }
		  System.out.println(rev);
		 
		/*
		 * StringBuffer sb= new StringBuffer(s); System.out.println(sb.reverse());
		 */}
		
}

