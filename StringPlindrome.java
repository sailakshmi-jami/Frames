package javaprograms;

public class StringPlindrome {

	public static void main(String[] args) {
		String s="sai"	;
		String rev=new StringBuffer(s).reverse().toString();
		if(s.equals(rev)) {
			System.out.println("the given string is palindrome");
			}
			else {
				System.out.println("the given string is not a palindrome");
			}
				System.out.println(s);
				System.out.println(rev);
			
		}
		}
		


