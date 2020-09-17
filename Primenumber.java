package javaprograms;

public class Primenumber {
	public static boolean isprimenumber(int num) {
		if (num <= 1) {

			System.out.println("the given number is not prime");
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("the given number is not prime");
				return false;
			}
		}
		System.out.println("the given number is prime");
		return true;
	}

	public static void main(String[] args) {

		isprimenumber(11);

	}

}
