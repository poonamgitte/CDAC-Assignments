package org.acts.util;

import java.util.Iterator;

public class LinkedList<T> implements List<T>, Iterable<T> {

	Node<T> start;
	Node<T> end;
	Node<T> current;
	int maxCount = 0;

	// Add new Node
	@Override
	public void add(T data) throws UpdateListException{
		
		if(data==null)
		throw new UpdateListException("Invalid Data");
		Node<T> tempNode = new Node<T>(data);

		if (start == null)
			start = end = current = tempNode;
		else {
			end.next = tempNode;
			tempNode.previous = end;
			end = tempNode;
		}
		maxCount++;
	}

	// get first node
	@Override
	public T getFirst() throws TraverseListException{
		if (start == null)
			throw new TraverseListException("List Empty");
		else {

			current = start;
			return current.data;
		}
	}

	// get last node
	@Override
	public T getLast() throws TraverseListException{
		if (end == null)
			throw new TraverseListException("Last Element Not Found ");
		else {

			return end.data;
		}
	}

	// get previous node
	@Override
	public T getPrevious() throws TraverseListException{
		if (start == null)
			throw new TraverseListException("List Empty ");
		if(current.previous == null)
			throw new TraverseListException("Previous Element Not Found ");
		else {
			current = current.previous;
			return current.data;

		}
	}

	// get next node
	@Override
	public T getNext() throws TraverseListException {
		if (start == null)
			throw new TraverseListException("List Empty ");
		if(current.next == null)
			throw new TraverseListException("Next Element Not Found ");
		else {
			current = current.next;
			return current.data;
		}
	}

	// delete node
	@Override
	public void delete(int index)  throws UpdateListException{

		
		// If list is empty or index out of bond
		if (start == null)
			throw new UpdateListException("List Empty");
		if(index > maxCount - 1) 
			throw new UpdateListException("List Empty");

		// if only 1 node in list
		else if (start.next == null || start == end) {
			start = end = current = null;
		}

		// if first node to delete
		else if (index == 0) {
			start = start.next;
			start.previous = null;
		}

		// if last node to delete
		else if (index == maxCount - 1) {
			end = end.previous;
			end.next = null;
		}

		// delete intermediate node
		else {
			Node<T> tempNode = start;
			for (int iTemp = 0; iTemp < index; iTemp++) {
				tempNode = tempNode.next;
			}

			tempNode.next.previous = tempNode.previous;
			tempNode.previous.next = tempNode.next;
		}
		current = start;
		maxCount--;
	}

	// Insert at index

	public void insertAtPosition(int index, T data)  throws UpdateListException {

		Node<T> newNode = new Node<T>(data);

		// if position out of bond
		if (index > maxCount)
			return;

		// add in empty list
		if (start == null) {
			start = end = current = newNode;
		}

		else if (index == 0) {
			start.previous = newNode;
			newNode.next = start;
			start = newNode;
		}

		// 1 element in list
		else if (start.next == null && index == 1) {
			start.next = newNode;
		}

//		else if(index == maxCount-1) {
//			newNode.previous = end.previous;
//			newNode.next = end;
//		}
//		
		else if (index == maxCount) {
			newNode.previous = end;
			end.next = newNode;
			end = newNode;
		}

		// add intermediate node
		else {
			Node<T> positionNode = start;
			for (int iTemp = 0; iTemp < index; iTemp++) {
				positionNode = positionNode.next;
			}

			newNode.next = positionNode;
			newNode.previous = positionNode.previous;

			positionNode.previous.next = newNode;
			positionNode.previous = newNode;

		}
	}

	// Overriding Iterator

	@Override

	public Iterator<T> iterator() {
		return new LinkedListIterator();
	}

	// Inner class

	private class LinkedListIterator implements Iterator<T> {
		int index;

		{
			current = start;
		}

		@Override
		public boolean hasNext() {
			return index < maxCount;
		}

		@Override
		public T next() {

			T data = current.data;

			if (current.next != null || start != null) {
				current = current.next;
				index++;
			}

			return data;
		}
	}

}
