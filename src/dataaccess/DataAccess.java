package dataaccess;

import java.util.HashMap;
import java.util.List;

import classes.*;

public interface DataAccess {
	//Members
	public void saveMember(Member member);
	public HashMap<Integer, Member> readMembers();
	public List<Member> readMembersList();
	
	//Book
	public void saveBook(Book book);
	public HashMap<String, Book> readBooks();
	public List<Book> readBooksList();
	
	//CheckoutRecord
	public void saveCheckoutRecord(CheckoutRecord checkout);
	public HashMap<Integer, CheckoutRecord> readCheckoutRecords();
	public List<CheckoutRecord> readCheckoutRecordsList();
	
}
