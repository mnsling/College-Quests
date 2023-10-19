package main;
import java.util.ArrayList;

class Book {
    // Private data variables
    private String title;
    private ArrayList<Author> authorList;

    // Constructor
    public Book(String title) {
        this.title = title;
        this.authorList = new ArrayList<>(); // Initialize the authorList
    }

    // Getter
    public String getTitle() {
        return title;
    }
    
    public ArrayList<Author> getAuthorList() {
    return new ArrayList<>(authorList); // Create a copy of the authorList and return it
}

    // Add Author method
    public void addAuthor(Author author) {
        authorList.add(author);
    }

    @Override
    public String toString() {
        return title;
    }
}
