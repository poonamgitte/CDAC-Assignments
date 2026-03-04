package library.core;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class Member implements Serializable{
	
	private int memberId;
	private String name;
	private LocalDate membershipDate;
	private List<Integer> borrowedBooks;
	
	// Constructor
	public Member(int memberId, String name, LocalDate membershipDate) {
		super();
		this.memberId = memberId;
		this.name = name;
		this.membershipDate = membershipDate;
		//this.borrowedBooks = borrowedBooks;
	}

	// Setter getter methods
	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getMembershipDate() {
		return membershipDate;
	}

	public void setMembershipDate(LocalDate membershipDate) {
		this.membershipDate = membershipDate;
	}

	public List<Integer> getBorrowedBooks() {
		return borrowedBooks;
	}

	public void setBorrowedBooks(List<Integer> borrowedBooks) {
		this.borrowedBooks = borrowedBooks;
	}

	// To string method overridden
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", name=" + name + ", membershipDate=" + membershipDate
				+ ", borrowedBooks=" + borrowedBooks + "]";
	}
	
	
	
	
	
	
}
