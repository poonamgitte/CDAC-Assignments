package org.acts.util;

public interface List<T> extends TraverseList<T> {
		void add(T data) throws UpdateListException;
		void delete(int index)  throws UpdateListException;
}
