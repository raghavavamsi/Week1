package day1;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class CustomArrayList<T> extends ArrayList<T>{

	private static final long serialVersionUID = 1L;

	public CustomArrayList() {
		
	}
	
	private boolean addElement(T obj) {
		boolean added = false;
		int num_of_occurrences = Collections.frequency(this, obj);
		if (num_of_occurrences < 2) {
			added = super.add(obj);
		}
		return added;
	}
	
	@Override
	public boolean add(T obj) {
		return addElement(obj);
	}

	@Override
	public void add(int index, T obj) {
		addElement(obj);
	}

	@Override
	public boolean addAll(Collection<? extends T> coll) {
		boolean added_all_elements = true;
		for (T element : coll) {
			added_all_elements = addElement(element);
		}

		return added_all_elements;
	}
	
	@Override
	public T set(int index, T obj) {
		int num_of_occurrences = Collections.frequency(this, obj);
		T pElement = super.get(index);

		if (num_of_occurrences < 2) {
			super.set(index, obj);
		}

		return pElement;
	}
	
	public static void main(String[] args) {
		CustomArrayList<String> cArrayList = new CustomArrayList<String>();
		  cArrayList.add("abc");
		  cArrayList.add("abc");
		  cArrayList.add("abc");
		  
		  System.out.println(cArrayList);
		  //For testing purpose
		  HashSet<String> hss = new HashSet<String>(cArrayList);
		  System.out.println(hss);
		 }

	}