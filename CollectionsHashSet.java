package javaprograms;
import java.util.Iterator;
import java.util.LinkedHashSet;



public class CollectionsHashSet {
	
//linked list is in order
//hashset duplicates deleted
	
	public static void main(String[] args) {
		LinkedHashSet<String> set=new LinkedHashSet<String>();  
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay");  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		

	}

}
