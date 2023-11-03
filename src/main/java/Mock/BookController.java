package Mock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {
    @Autowired
    BookService bookService = new BookService();

    @PostMapping("/addBook")
    public String addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }

    @PostMapping("/addAuthor")
    public String addAuthor (@RequestBody Author author)
    {
        return  bookService.addAuthor(author);
    }

    @GetMapping("/bookWithMaximumPages")
    public String bookWithMaxPages()
    {
        return bookService.bookWithMaximumPages();
    }

    @PutMapping("/updateNoOfPages")
    public String updateNoOfPages(@RequestBody Book book)
    {
        return bookService.updatePages(book);
    }
}
