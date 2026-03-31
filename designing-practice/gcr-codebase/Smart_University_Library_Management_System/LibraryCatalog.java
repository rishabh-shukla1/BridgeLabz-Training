package Smart_University_Library_Management_System;

import java.util.*;

public class LibraryCatalog {
	
	private static LibraryCatalog instance;
	private List<Observer> observers = new ArrayList<>();

	
	private LibraryCatalog() {
		
	}
	
	public static synchronized LibraryCatalog getInstance() {
		
		if(instance==null)
		{
			instance=new LibraryCatalog();
		}
		
		
		return instance;
	}
	
	 public void addObserver(Observer o) {
	        observers.add(o);
	    }

	    public void addBook(String bookName) {
	        notifyUsers(bookName);
	    }

	    private void notifyUsers(String bookName) {
	        for (Observer o : observers) {
	            o.update("New book available: " + bookName);
	        }
	    }

}
