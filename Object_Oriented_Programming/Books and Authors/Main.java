package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Person> authors = new ArrayList<>();
        ArrayList<Book> books = new ArrayList<>();

        boolean selection = true;
        String menuItems;

        while (selection) {
            System.out.println("-----------------------------------------------");
            System.out.println("A: Add Authors");
            System.out.println("B: Add Book and assign Authors");
            System.out.println("C: View Books and Authors");
            System.out.println("D: View Authors and Books");
            System.out.println("Q: Quit");
            System.out.print("Enter choice: ");
            menuItems = input.nextLine();
            System.out.println("-----------------------------------------------");

            switch (menuItems.toUpperCase()) {
                case "A":
                    addAuthors(authors);
                    break;
                case "B":
                    addBooks(authors, books);
                    break;
                case "C":
                    bookAndAuthor(books);
                    break;
                case "D":
                    authorAndBook(authors, books);
                    break;
                case "Q":
                    selection = false;
                    break;
            }
        }
        input.close();
    }

    // add authors method
    public static void addAuthors(ArrayList<Person> authors) {
        System.out.print("Input Author Name: ");
        String authorName = input.nextLine();

        boolean isAuthorListed = false;

        for (Person author : authors) {
            if (authorName.equalsIgnoreCase(author.getName())) {
                System.out.println("Author is already listed.");
                isAuthorListed = true;
                break;
            }
        }

        if (!isAuthorListed) {
            Author newAuthor = new Author(authorName);
            authors.add(newAuthor);
            System.out.println("Authors: " + authors);
        }
    }

    // add books and assign authors method
    public static void addBooks(ArrayList<Person> authors, ArrayList<Book> books) {
        System.out.print("Input Book Title: ");
        String bookName = input.nextLine();

        boolean isBookListed = false;

        for (Book book : books) {
            if (bookName.equalsIgnoreCase(book.getTitle())) {
                System.out.println("Book Title is already listed");
                isBookListed = true;
                break;
            }
        }

        if (!isBookListed) {
            Book newBook = new Book(bookName);
            books.add(newBook);

            boolean assignAuthors = true;
            while (assignAuthors) {
                System.out.print("Input Author Name (or 'done' to finish assigning authors): ");
                String authorName = input.nextLine();

                if (authorName.equalsIgnoreCase("done")) {
                    assignAuthors = false; 
                } else {
                    boolean isAuthorFound = false;

                    for (Person author : authors) {
                        if (authorName.equalsIgnoreCase(author.getName())) {
                            Author authorObject = (Author) author;
                            authorObject.addBook(newBook);
                            newBook.addAuthor(authorObject);
                            isAuthorFound = true;
                            System.out.println("Author '" + authorName + "' assigned to the book.");
                            break;
                        }
                    }

                    if (!isAuthorFound) {
                        System.out.println("Author '" + authorName + "' is not listed.");
                    }
                }
            }

            System.out.println("Authors have been assigned to the book");
        }
    }
    
    //view books and its authors method
    public static void bookAndAuthor(ArrayList<Book> books) {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book book : books) {
            System.out.println("Book Title: " + book.getTitle());
            ArrayList<Author> authors = book.getAuthorList();
            if (authors.isEmpty()) {
                System.out.println("No authors assigned to this book.");
            } else {
                System.out.println("Authors:");
                for (Author author : authors) {
                    System.out.println("- " + author.getName());
                }
            }
            System.out.println("---------------");
        }
    }
    
    public static void authorAndBook(ArrayList<Person> authors, ArrayList<Book> books) {
        if (authors.isEmpty()) {
            System.out.println("No authors available.");
            return;
        }

        for (Person author : authors) {
            System.out.println("Author: " + author.getName());
            boolean hasBooks = false;
            for (Book book : books) {
                Author authorObject = (Author) author;
                if (authorObject.getBooks().contains(book)) {
                    if (!hasBooks) {
                        System.out.println("Books:");
                        hasBooks = true;
                    }
                    System.out.println("- " + book.getTitle());
                }
            }

            if (!hasBooks) {
                System.out.println("No books written by this author.");
            }
            System.out.println("---------------");
        }
    }
}
