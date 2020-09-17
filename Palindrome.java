package javaprograms;

public class Palindrome {
public static void ispalindrome(int num) {
	
System.out.println("the given number is" +num);	
      int r=0;
      int sum=0;
      int t=num;
      while(num>0) {
    	  r= num%10;
    	  sum=(sum*10)+r;
    	  num=num/10;
      }

	if(t==sum) {
		System.out.println("its palindrome number");
	}
	else {
		System.out.println("not a palindome number");
	}
}
	public static void main(String[] args) {
		ispalindrome(101);

	}

}
