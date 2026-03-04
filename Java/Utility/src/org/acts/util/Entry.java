package org.acts.util;

import java.util.Iterator;
import org.acts.util.LinkedList;
import org.acts.util.List;
import org.acts.util.TraverseList;

//import com.console.input.ConsoleInput;

public class Entry {

	public static void main(String[] args) {
		// int choice=0;
//		System.out.println("Enter 1.for List 2.Queue");
//		choice = ConsoleInput.getInteger();
//		
		LinkedList<String> objList = new LinkedList<>();

//		if(choice==1)
//			objList = ListFactory.getInstance();

		manipulate(objList);
		// displayList(objList);

		for (String data : objList)
			System.out.println(data);

	}

	public static void manipulate(List<String> objList) {
		try {
			objList.add("First");
			objList.add("Second");
			objList.add("Third");
			objList.add("Fourth");
			objList.add("");

			objList.delete(1);
		} catch (UpdateListException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//	public static void displayList(TraverseList<String> objTraverseList) {
//		String data = objTraverseList.getFirst();
//
//		while (data != null) {
//			System.out.println(data);
//			data = objTraverseList.getNext();
//		}
//		//List<String>objList=(List<String>)objTraverseList;
//	}

}
