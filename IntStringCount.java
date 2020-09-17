package javaprograms;

public class IntStringCount {

	public static void main(String[] args) {


		String s = "sai3545lakshmi";
		for(int i=0; i<=s.length()-1; i++)
		{
			char ch = s.charAt(i);
			if(Character.isDigit(ch))
				System.out.print(ch);
		}
	}

	}

