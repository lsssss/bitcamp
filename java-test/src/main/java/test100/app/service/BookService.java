package test100.app.service;

import java.util.List;
import java.util.Map;

import test100.app.domain.Book;


public interface BookService {
    List<Book> list(int pageNo, int pageSize, Map<String,Object> options);
    Book get(int no);
    int getTotalCount();
    int add(Book book);
    int update(Book book);
    int delete(int no);
    int deleteFile(Book book);
}
