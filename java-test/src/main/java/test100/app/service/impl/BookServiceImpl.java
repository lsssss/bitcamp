package test100.app.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test100.app.dao.BookDao;
import test100.app.domain.Book;
import test100.app.service.BookService;

@Service
public class BookServiceImpl implements BookService{

    @Autowired BookDao bookDao;
    
    @Override
    public List<Book> list(int pageNo, int pageSize, Map<String, Object> options) {
        HashMap<String,Object> params = new HashMap<>();
        params.put("startIndex", (pageNo-1) * pageSize);
        params.put("size", pageSize);
        if (options != null) {
            options.putAll(options);
        }
        return bookDao.findAll(params);
        
    }
    
    
    @Override
    public Book get(int no) {
        
        Book book = bookDao.findByNo(no);
        
        return book;
    }
    
    @Override
    public int getTotalCount() {
        return bookDao.countAll();
    }

    @Override
    public int add(Book book) {
        return bookDao.insert(book);
    }

    @Override
    public int update(Book book) {
        bookDao.deleteFile(book.getBookno());
        return bookDao.update(book);
        
    }

    @Override
    public int delete(int no) {
        return bookDao.delete(no);
       
    }

    @Override
    public int deleteFile(Book book) {
        return bookDao.deleteFile(book.getBookno());
    }
    
}
