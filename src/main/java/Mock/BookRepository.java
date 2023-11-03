package Mock;

import org.springframework.stereotype.Repository;

import java.util.HashMap;


@Repository
public class BookRepository {

    private HashMap<String,Book> bookMap = new HashMap<>();
    private HashMap<String,Author> authorMap = new HashMap<>();

    private HashMap<String, Integer> authorBookMap = new HashMap<>();

    public HashMap<String, Integer> getAuthorBookMap() {
        return authorBookMap;
    }

    public void setAuthorBookMap(HashMap<String, Integer> authorBookMap) {
        this.authorBookMap = authorBookMap;
    }

    public HashMap<String, Book> getBookMap() {
        return bookMap;
    }

    public void setBookMap(HashMap<String, Book> bookMap) {
        this.bookMap = bookMap;
    }

    public HashMap<String, Author> getAuthorMap() {
        return authorMap;
    }

    public void setAuthorMap(HashMap<String, Author> authorMap) {
        this.authorMap = authorMap;
    }
}
