package controllers;

import Models.Book;
import play.mvc.*;

import java.util.*;

import views.html.Book.index;


public class BookController extends Controller {

    public Result index(){
        Set<Book> books = Book.allBooks();
        return ok(index.render(Collections.singleton(books)));
    }

    public Result create(){
        return TODO;
    }

    public Result save(){
        return TODO;
    }

    public Result edit(Integer id){
        return TODO;
    }

    public Result update(){
        return TODO;
    }

    public Result destroy(Integer id){
        return TODO;
    }

    public Result show(Integer id){
        return  TODO;
    }
}
