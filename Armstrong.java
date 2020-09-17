package javaprograms;

public class Armstrong {
	
	public static void isarmstrong(int num) {
		System.out.println("the given number is"  +num);
		int r=0;
		int cube=0;
		int t=num;
		while(num>0) {
			r=num%10;
			cube=cube+(r*r*r);
	num=num/10;
		}
		if(t==cube) {
			System.out.println("the given number is armstrong");
		}
		else {
			System.out.println("the given number is not armstrong");
		}
	}

	public static void main(String[] args) {
		
		isarmstrong(153);
	}

}
