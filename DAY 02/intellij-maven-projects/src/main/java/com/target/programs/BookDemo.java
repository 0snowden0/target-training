package com.target.programs;

import com.target.model.Book;
public class BookDemo {
    public static void main(String[] args){
        Book b1 = new Book();
        b1.setTitle("Revolution 2020");
        b1.setPageCount(200);
        b1.setAuthor("Chetan Bhagat");
        b1.setPrice(400.00);

        System.out.printf("The Author of the Book is %s\n",b1.getAuthor());
        System.out.printf("The Price of the book is %.2f\n",b1.getPrice());
        System.out.printf("The Name of the book is %s\n",b1.getTitle());
        System.out.printf("The page count of the book is %d\n",b1.getPageCount());
    }
}
