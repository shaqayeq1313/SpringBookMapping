package ir.freeland.springboot.requestparam.bookmapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private List<Book> bookList = new ArrayList<>();
    

    // CREATE - POST
    @PostMapping("/books")
	@ResponseBody
    public Book createBook(@RequestBody Book book) {
        bookList.add(book);
        return book;
    }

    
    // READ - GET
    @GetMapping("/{id}")
	@ResponseBody
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        for (Book book : bookList) {
            if (book.getId() == id) {
                return new ResponseEntity<>(book, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    
    // UPDATE - PUT
    @PutMapping("/{id}")
	@ResponseBody
    public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {
        for (int i = 0; i < bookList.size(); i++) {
            Book book = bookList.get(i);
            if (book.getId() == id) {
                bookList.set(i, updatedBook);
                return new ResponseEntity<>(updatedBook, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    

    // DELETE - DELETE
    @DeleteMapping("/{id}")
	@ResponseBody
    public ResponseEntity<String> deleteBook(@PathVariable Long id) {
        for (int i = 0; i < bookList.size(); i++) {
            Book book = bookList.get(i);
            if (book.getId() == id) { 
                bookList.remove(i);    
                return new ResponseEntity<>("Book with ID " + id + " has been deleted", HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
