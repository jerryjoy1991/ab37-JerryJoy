package package_collection;

//98 --WAP on LinkedList
import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;

public class Collection_03 {

	public static void main(String[] args) {
		LinkedList a1=new LinkedList();
		a1.add("Anu");
		a1.add("Arun");
		a1.add("Jay");
		a1.add("Varun");
		a1.add("Ram");
		a1.add("Balu");
		a1.add("Ram");
		a1.add("Ram");
		a1.add(10);
		a1.add(20);
		a1.add(true);
		a1.add(false);
		a1.add(true);
		a1.add('c');
		a1.add(null);
		a1.add(null);
		System.out.println(a1);
		//Collections.sort(a1);
		//System.out.println(a1);

	}

}
