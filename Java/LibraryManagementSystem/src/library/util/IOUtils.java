package library.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Map;

import library.core.Book;
import library.core.*;
import library.core.BorrowRecords;
import library.exception.LibraryException;

public class IOUtils {

	// Save and load book
	// Serialization
	public static void saveBook(List<Book>bookList, String filename) throws LibraryException {
		
		try (ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream(filename))) {
//			if(filename == null) {
//				throw new LibraryException("File not found");
//			}
			objOut.writeObject(bookList);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//Deserialization
	
	@SuppressWarnings("unchecked")
	public static void loadBook(List<Book>bookList, String filename) throws LibraryException {
		
		try (ObjectInputStream objIn = new ObjectInputStream(new FileInputStream(filename))) {
			if(filename == null) {
				throw new LibraryException("File not found");
			}
			
			List<Book> loadList = (List<Book>)objIn.readObject();
			
			bookList.addAll(loadList);
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	// Save and load BorroRecord
		// Serialization
		public static void saveRecord(List<BorrowRecords>recordList, String filename) throws LibraryException {
			
			try (ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream(filename))) {
//				if(filename == null) {
//					throw new LibraryException("File not found");
//				}
				objOut.writeObject(recordList);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//Deserialization
		
		@SuppressWarnings("unchecked")
		public static void loadRecord(List<BorrowRecords>recordList, String filename) throws LibraryException {
			
			try (ObjectInputStream objIn = new ObjectInputStream(new FileInputStream(filename))) {
				if(filename == null) {
					throw new LibraryException("File not found");
				}
				
				List<BorrowRecords> loadList = (List<BorrowRecords>)objIn.readObject();
				
				recordList.addAll(loadList);
			} catch (ClassNotFoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		// Save and load Members
		// Serialization
		public static void saveMember(List<Member>memberList, String filename) throws LibraryException {
			
			try (ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream(filename))) {
//				if(filename == null) {
//					throw new LibraryException("File not found");
//				}
				objOut.writeObject(memberList);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//Deserialization
		
		@SuppressWarnings("unchecked")
		public static void loadMember(List<Member>memberList, String filename) throws LibraryException {
			
			try (ObjectInputStream objIn = new ObjectInputStream(new FileInputStream(filename))) {
				if(filename == null) {
					throw new LibraryException("File not found");
				}
				
				List<Member> loadList = (List<Member>)objIn.readObject();
				
				memberList.addAll(loadList);
			} catch (ClassNotFoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
