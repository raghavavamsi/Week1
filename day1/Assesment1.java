package day1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Assesment1 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Ravi");
		al.add("Chetti");
		al.add("ramesh");
		al.add("Kamal");
		al.add("Rajini");
		TreeSet<String> tset = new TreeSet<String>(al);
		Iterator<String> itr = tset.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
