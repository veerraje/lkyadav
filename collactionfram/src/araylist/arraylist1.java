package araylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class arraylist1 {
public static void main(String[] args) {
	/*ArrayList l1 = new ArrayList();
	l1.add(121,"ghjk");
	l1.add(18, "gdshdg");*/
	ArrayList  arr1 = new ArrayList();
	
	arr1.add(12);
	arr1.add(13);
	arr1.add(77);
	arr1.add("veer");
	arr1.add(45.345);
	arr1.add(8778);
	arr1.add(999);
	arr1.add( "veersingh");
	//for (Integer it : arr1)
		/*for(int i = 0; i<arr1.size(); i++){
			System.out.println(i);
		}
	*/
	
	System.out.println(arr1.size());
	arr1.add(0, 67);
	System.out.println(arr1);
	
	
	System.out.println(arr1.size());
	System.out.println(arr1);
	ListIterator it1 = arr1.listIterator();
	while(it1.hasNext()){
		System.out.println(it1.next());
	}
	System.out.println(arr1.set(7, "raje"));
	System.out.println(arr1);
	
	while(it1.hasPrevious()){
		System.out.println(it1.previous());
	}
	//System.out.println(arr1);
	arr1.add(null);
	arr1.add(null);
	arr1.add(null);
	arr1.add(100);
	arr1.add(100);
	arr1.add(100);
	
	System.out.println(arr1);
	
	ArrayList list = new ArrayList<>();
	list.add(56);
	list.add(78);
	list.add("dbhj");
	list.addAll(arr1);
	System.out.println(list);
	System.out.println(list);
	list.set(12, "twevle");
	System.out.println(list);
	//list.addAll(13, arr1);
	/*ArrayList list2 = new ArrayList<>();
	list2.add("one");
	list2.add("two");
	list2.add("three");
	System.out.println(list2);*/
	//list2.addAll(2, list);
	System.out.println(list);
	for(int i = 0; i<=list.size(); i++){
		list.add(list.get(i));
	}
	list.clear();
	arr1.clear();
	//System.out.println(list2.clear());
	
}
}
