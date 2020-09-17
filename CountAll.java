package javaprograms;

public class CountAll {

	public static void main(String[] args) {
		char[] ch;
		String str = "saiiii  123 @3#457hdjahs @";
		int letter = 0, space = 0, num = 0, others = 0;
		ch = str.toCharArray();
		int len = str.length();
		for (int i = 0; i <= len - 1; i++) {
			if (Character.isLetter(ch[i])) {
				letter++;
			} else if (Character.isDigit(ch[i])) {
				num++;
			} else if (Character.isSpaceChar(ch[i])) {
				space++;

			} else {
				others++;
			}
		}
		System.out.println("letters  "   +letter);
		System.out.println("number   "    +num);
		System.out.println("space   "     +space);
		System.out.println("other    "    +others);

	}

}
