package javaprograms;

public class Occurances {

	public static void main(String[] args) {
		String s="java programming language";
		int total=s.length();
		s=s.replace("a", "");
		int afterremove= s.length();
		int count=total-afterremove;
		System.out.println("A occurances.....   "+count);
		
		
	}

}
