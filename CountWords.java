package javaprograms;

public class CountWords {
	
	
	public static void main(String[] args) {
		String s="sai lakshmi jami ";
		int count=1;
		for(int i=1;i<s.length()-1;i++) {
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' ')){
				count++;
			}
		}
		System.out.println("no of words           "+count);
	}

}
