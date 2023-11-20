package com.nagarro.libraryApplication.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
    private int id;
    private String Name;
    private String author;
    private String publisher;
}
