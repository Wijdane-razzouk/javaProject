package org.mql.java;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
public class ListeTests {
	private int counter;
	
	public ListeTests(int counter) {
		this.counter=counter;
		
	}
	public void testLinkedList() {
		List<String> list= new LinkedList<String>();
		for(int i=0; i<counter; i++) {
			list.add(0,""+i);
		}
		
	}
	public void testVector() {
		List<String> list= new Vector<String>();
		for(int i=0; i<counter; i++) {
			list.add(0,""+i);
		}
	}
	public void testArrayList() {
		List<String> list= new ArrayList<String>();
		for(int i=0; i<counter; i++) {
			list.add(0,""+i);
		}
	}

}
