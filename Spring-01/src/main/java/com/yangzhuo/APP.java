package com.yangzhuo;

import com.yangzhuo.service.BookService;
import com.yangzhuo.service.impl.BookServiceImpl;

public class APP {
    public static void main(String[] args) {
        BookService bookService=new BookServiceImpl();
        bookService.save();
    }
}
