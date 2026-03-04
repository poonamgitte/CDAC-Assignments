package library.core;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Map;

public class BorrowRecords implements Serializable{
//	private Book book;
//	private Member menber;
	
	Map<Integer, List<Integer>> borrowRecords;
	private LocalDate issueDate;
	private LocalDate returnDate;
	
	//Constructor
	public BorrowRecords(LocalDate issueDate, LocalDate returnDate) {
		super();
		this.issueDate = issueDate;
		this.returnDate = returnDate;
	}


	// setter getter methods

	
	
	public boolean isOverDue() {
		
		LocalDate currentDate = LocalDate.now();
		
		return (currentDate.isAfter(returnDate));
		
//		int result = returnDate.compareTo(currentDate);
//		
//		if(result <= 0) {
//			return true;
//		}
//		else {
//			
//			return false;
//		}
	}
	
	
	public Map<Integer, List<Integer>> getBorrowRecords() {
		return borrowRecords;
	}


	public void setBorrowRecords(Map<Integer, List<Integer>> borrowRecords) {
		this.borrowRecords = borrowRecords;
	}


	public LocalDate getIssueDate() {
		return issueDate;
	}


	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}


	public LocalDate getReturnDate() {
		return returnDate;
	}


	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}


	public int daysOverDue() {
		LocalDate currentDate = LocalDate.now();
		
		if(isOverDue()) {
			int totalDays = (int)ChronoUnit.DAYS.between(returnDate, currentDate);
			return totalDays;
		}
		
		return 0;
	}
}
