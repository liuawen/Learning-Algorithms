package com.mj;

import com.mj.list.ArrayList;
import com.mj.list.List;

public class Stack<E> {
	//这样做非常可以  内部ArrayList
	//Vector官方的   	synchronized    peek  top
	private List<E> list = new ArrayList<>();
	
	public void clear() {
		list.clear();
	}
	
	public int size() {
		return list.size();
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public void push(E element) {
		list.add(element);
	}


	public E pop() {
		return list.remove(list.size() - 1);
	}


	public E top() {
		return list.get(list.size() - 1);
	}
}
