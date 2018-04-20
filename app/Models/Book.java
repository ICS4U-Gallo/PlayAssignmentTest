package Models;

import java.util.*;

public class Book {

    public int id;
    public String title;
    public int price;
    public String author;

    public Book(int id, String title, int price, String author){

        this.id = id;
        this.title = title;
        this.price = price;
        this.author = author;

    }

    private static Set<Book> books;

    static {

        books = new HashSet<>();
        books.add(new Book(1,"C++",20,"Joseph"));
        books.add(new Book(2,"Java",25,"Alex"));
    }

    public static Set<Book> allBooks(){
        return books;
    }

    public static Book findById(int id){
        for(Book book : books){
            if(id == (book.id)){
                return book;
            }
        }

        return null;

    }

    public static void addBook(Book book){
        books.add(book);
    }

    public static boolean remove(Book book){
        return books.remove(book);
    }

}
