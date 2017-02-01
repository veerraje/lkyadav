package araylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import list.arraylist2;
class B{
	
}
public class A extends B {
static int counte = 0;
public A() {
	counte++;
}

public static void main(String[] args) {
	
	A a1 = new A();
	A a2 = new A();
	A a3 = new A();
	A a4 = new A();
	A a5 = new A();
	A a6 = new A();
	A a7 = new A();
	B a8 = new B();
	
	B a9 = new B();
	B a10 = new B();
	B a11 = new B();
	
	System.out.println("number of objects are :"+counte);
	
	/*ArrayList<Integer> list = new ArrayList<>(3);
	list.add(11);
	list.add(32);
	list.add(78);
	list.add(10);
	list.add(16);
	list.add(90);
	System.out.println(list);
	list.add(4, 100);
	//list.removeAll(list);
	System.out.println(list);
	System.out.println(list.indexOf(16));*/

}
}
