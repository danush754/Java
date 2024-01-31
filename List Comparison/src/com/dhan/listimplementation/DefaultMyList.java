package com.dhan.listimplementation;

//import org.w3c.dom.Node;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class DefaultMyList implements MyList,ListIterable{

	private Node first;

	private Node last;

	private int size;


	@Override
	public void add(Object e) {
		final Node lastNode = last;
//		The syntax for creating new node is access modifier Node variable =  new Node(previous element,data,next element)
//		it is a  linked list so whenever we insert a new data it should be linked to the previous data
		final Node newNode = new Node(lastNode,e,null);
		lastNode = newNode;
		if(lastNode==null){
			first = newNode;
		}
		else {
			lastNode.next=newNode;
		}
		size++;
	}

	@Override
	public void clear() {
		for (Node x = first;x != null){
			Node next = x.next;
			x.data = null;
			x.next = null;
			x.previous = null;
			x = next;
		}
		first = null;
		last = null;
		size = 0;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(MyList c) {
		// TODO Auto-generated method stub
		return false;
	}

}
