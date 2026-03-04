package library.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LibraryUtils {

	// Borrow book
	public static void borrowBook(int memberId, int bookId, List<Book> books, List<Member> members,
			Map<Integer, List<Integer>> borrowRecords) {

		Book foundBook = null;
		Member foundMember = null;

// Step 1: Check if already borrowed
		if (borrowRecords.containsKey(memberId) && borrowRecords.get(memberId).contains(bookId)) {
			System.out.println("❌ Book already borrowed by this member!");
			return;
		}

// Step 2: Find book
		for (Book b : books) {
			if (b.getBookId() == bookId) {
				foundBook = b;
				break;
			}
		}
		if (foundBook == null) {
			System.out.println("❌ Book not found!");
			return;
		}

// Step 3: Find member
		for (Member m : members) {
			if (m.getMemberId() == memberId) {
				foundMember = m;
				break;
			}
		}
		if (foundMember == null) {
			System.out.println("❌ Member not found!");
			return;
		}

// Step 4: Check availability and borrow
		if (!foundBook.isAvailable()) {
			System.out.println("❌ Book is already borrowed!");
			return;
		}

		foundBook.setAvailableCopies(false);

		borrowRecords.putIfAbsent(memberId, new ArrayList<>());
		borrowRecords.get(memberId).add(bookId);

		System.out.println("✅ Book borrowed successfully by " + foundMember.getName());
	}

	public static void returnBook(int memberId, int bookId, List<Book> books,
			Map<Integer, List<Integer>> borrowRecords) {

// Step 1: Check if member has borrowed anything
		if (!borrowRecords.containsKey(memberId)) {
			System.out.println("❌ This member has not borrowed any books!");
			return;
		}

		List<Integer> borrowedBooks = borrowRecords.get(memberId);

// Step 2: Check if the book is borrowed by this member
		if (!borrowedBooks.contains(bookId)) {
			System.out.println("❌ This book is not borrowed by the member!");
			return;
		}

// Step 3: Find the book in the book list
		Book foundBook = null;
		for (Book b : books) {
			if (b.getBookId() == bookId) {
				foundBook = b;
				break;
			}
		}

		if (foundBook == null) {
			System.out.println("❌ Book not found in records!");
			return;
		}

// Step 4: Mark book as available again
		foundBook.setAvailableCopies(true);
		borrowedBooks.remove(Integer.valueOf(bookId));

// Step 5: If the member has no more borrowed books, remove the key
		if (borrowedBooks.isEmpty()) {
			borrowRecords.remove(memberId);
		}

		System.out.println("✅ Book '" + foundBook.getTitle() + "' returned successfully!");
	}

}
