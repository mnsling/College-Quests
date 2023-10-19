package main;
import java.util.ArrayList;

public class Author extends Person {
    
    ArrayList<Book> books = new ArrayList<Book>();
    
    //constructor
    public Author(String name) {
        super(name);
    }

    //addBook method
    public void addBook(Book book) {
        books.add(book);
    }
    
    //getter
    public ArrayList<Book> getBooks() {
        return books;
    }
    
}
