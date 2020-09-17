package javaprograms;

public class Duplicatesremove {

	public static void main(String[] args) {
		String s= "sbasi";
		StringBuilder sb= new StringBuilder() ;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			int idex=s.indexOf(ch,i+1);
			if (idex==-1) {
				sb.append(ch);
			}
		}
System.out.println(sb);
	}

}
