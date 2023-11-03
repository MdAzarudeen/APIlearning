package com.example.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository = new BookRepository();
    public String addBook(Book book){
        HashMap<String,Book> bookMap = bookRepository.getBookMap();
        bookMap.put(book.getName(),book);
        return "Book has been added";
    }

    public String addAuthor(Author author){
        HashMap<String, Author> authorMap = bookRepository.getAuthorMap();
        authorMap.put(author.getName(),author);
        return "Author has been added";
    }

    public String bookWithMaximumPages()
    {
        int maxPages=0;
        String bookWithMaxPage = "";
        HashMap<String,Book> bookMap = bookRepository.getBookMap();
        for(Book book: bookMap.values())
        {
            if(book.getNoOfPages()>maxPages)
            {
                maxPages = book.getNoOfPages();
                bookWithMaxPage = book.getName();
            }
        }
        return bookWithMaxPage;
    }

    public String updatePages(Book book)
    {
        String givenBook = book.getName();
        int givenPages = book.getNoOfPages();
        HashMap<String,Book> bookMap = bookRepository.getBookMap();
        for(Book bo: bookMap.values())
        {
            if(bo.getName()==givenBook)
            {
                bo.setNoOfPages(givenPages);
                return "No of Pages has been updated for the given book";
            }
        }

        return "Book is not in the Database";
    }

    public String getAuthorWithHighestPages()
    {
        HashMap<String,Book> bookMap = bookRepository.getBookMap();
        HashMap<String , Author> authorMap = bookRepository.getAuthorMap();
        HashMap<String,Integer> authorBookMap = bookRepository.getAuthorBookMap();
        for(Author author: authorMap.values())
        {
            String authorName = author.getName();
            for(Book book: bookMap.values())
            {
                if(book.getAuthorName()==authorName)
                    authorBookMap.put(authorName,authorBookMap.getOrDefault(authorName,0)+1);
            }
        }
        int res=0;
        String ans = "";
        for(String au: authorBookMap.keySet())
        {
           if(authorBookMap.get(au)>res)
               ans = au;
        }
            return ans;
    }
}
