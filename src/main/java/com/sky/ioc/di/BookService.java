package com.sky.ioc.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Qualifier("bookDao02")
    @Autowired(required = false)
    private BookDao bookDao01;

    public void print() {
        System.out.println(bookDao01);
    }
}
