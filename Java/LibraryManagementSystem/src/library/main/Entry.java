package library.main;

import java.time.LocalDate;
import java.util.ArrayList;
import library.core.*;
import java.util.List;
import java.util.Scanner;

import library.core.Book;
import library.core.BorrowRecords;
import library.core.Category;
import library.core.Member;
import library.exception.LibraryException;
import library.util.IOUtils;

public class Entry {

	public static void main(String [] args) throws LibraryException {
		
		List<Book>bookList = new ArrayList<>();
		
		List<Member>memberList = new ArrayList<>();
		
		List<BorrowRecords> recordList = new ArrayList<>();
		
		
		// Loading previous records
		IOUtils.loadBook(bookList, "LibraryBooks.ser");
		IOUtils.loadMember(memberList, "LibraryMembers.ser");
		IOUtils.loadRecord(recordList, "LibraryRecords.ser");
		
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		
		do {
			System.out.println("1.Add Book");
			System.out.println("2.Add member");
			System.out.println("3.Borrow book");
			System.out.println("4.Return book");
			System.out.println("5.Exit");

			System.out.println("Enter choice:");
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:{
				
				System.out.println("Enter book id :");
				int bookId = sc.nextInt();
				
				System.out.println("Enter category(FICTION, NONFICTION,SCIENCE,TECHNOLOGY,HISTORY):");
				Category category = Category.valueOf(sc.next().toUpperCase());
				
				sc.nextLine();
				
				System.out.println("Enter Title:");
				String title = sc.nextLine();
				
				boolean isAvailable = true ;
				
				bookList.add(new Book(bookId, title, category, isAvailable));
				
				System.out.println("New book added");
				
				bookList.forEach(System.out::println);

			}
			break;
			
			//Add member
			case 2:{
				
				System.out.println("Enter member id:");
				int memberId = sc.nextInt();
				
				sc.nextLine();
				System.out.println("Enter name:");
				String name = sc.nextLine();
				
				LocalDate membershipDate = LocalDate.now();
				
				memberList.add(new Member(memberId, name, membershipDate));
				System.out.println("new member added");
				
				memberList.forEach(System.out::println);
			}
			
			case 3:{
				
			}break;
			
			case 4:{
				
			}
			break;
			
			case 5:{
				
				// Saving data
				IOUtils.saveBook(bookList, "LibraryBooks.ser");
				IOUtils.saveMember(memberList, "LibraryMembers.ser");
				IOUtils.saveRecord(recordList, "LibraryRecords.ser");
			}
			
			default:{
				System.out.println("Enter valid choice");
			}
			}
			
		}while(choice != 5);
		
	}
}
