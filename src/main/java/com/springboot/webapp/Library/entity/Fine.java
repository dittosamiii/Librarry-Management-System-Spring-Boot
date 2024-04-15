package com.springboot.webapp.Library.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Fine {

	@Id
	@GeneratedValue
	private int sequence;
	private int bookId;
	private int studentId;
	private LocalDate issueDate;
	private LocalDate returnDate;
	private LocalDate returnedDate;
	private int amount;
	private String username;

	public Fine() {

	}

	public Fine(int sequence, String username, int bookId, int studentId, LocalDate issueDate, LocalDate returnDate,
			LocalDate returnedDate, int amount) {
		super();
		this.sequence = sequence;
		this.username = username;
		this.bookId = bookId;
		this.studentId = studentId;
		this.issueDate = issueDate;
		this.returnDate = returnDate;
		this.returnedDate = returnedDate;
		this.amount = amount;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
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

	public LocalDate getReturnedDate() {
		return returnedDate;
	}

	public void setReturnedDate(LocalDate returnedDate) {
		this.returnedDate = returnedDate;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	@Override
	public String toString() {
		return "fine [sequence=" + sequence + ", bookId=" + bookId + ", studentId=" + studentId + ", issueDate="
				+ issueDate + ", returnDate=" + returnDate + ", returnedDate=" + returnedDate + ", amount=" + amount
				+ ", username=" + username + "]";
	}

}
