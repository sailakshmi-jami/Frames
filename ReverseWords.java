package javaprograms;

public class ReverseWords {

	public static void main(String[] args) {

		String str = "sai lakshmi jami";
		String[] words = str.split(" ");
		for(int i=words.length-1; i>=0; i--)
		{
			String word = words[i];
			System.out.print(" " +word);
		}



	}

}
