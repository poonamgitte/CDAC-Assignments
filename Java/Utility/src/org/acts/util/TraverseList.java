package org.acts.util;

public interface TraverseList<T> {
	T getFirst() throws TraverseListException;
	T getLast() throws TraverseListException;
	T getNext() throws TraverseListException;
	T getPrevious() throws TraverseListException;
}
