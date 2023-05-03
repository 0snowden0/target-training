package com.targetindia.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book {
    private String title;
    private String author;
    private double price;
    private int pageCount;

    public Book(String title,String author){
        this.title=title;
        this.author=author;
    }

    public void setPrice(double price){
        if(price<=0){
            throw new RuntimeException("The price of a Book cannot be negative!");
        }
        this.price=price;
    }
}
