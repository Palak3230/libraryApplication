package com.nagarro.libraryApplication.service.impl;

import com.nagarro.libraryApplication.entity.Book;
import com.nagarro.libraryApplication.service.BookService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BookServiceImpl implements BookService {
    @Override
    public List<Book> getAllBooks(){
        List<Book> listOfBooks= new ArrayList<>();
        listOfBooks.add(new Book(1, "Harry Potter", "jk rowling", "jack"));
        listOfBooks.add(new Book(2, "Rich Dad Poor Dad", "Robert TK", "Sparrow"));
        listOfBooks.add(new Book(3, "Ikigai", "Miracles", "Franchisco"));
        return listOfBooks;
    }
}
