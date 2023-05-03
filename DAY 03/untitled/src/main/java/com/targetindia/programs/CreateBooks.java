package com.targetindia.programs;

import com.targetindia.model.Book;
public class CreateBooks {
    public static void main(String[] args){
        Book b1 = new Book();

        b1.setTitle("Revolution 2020");
        b1.setAuthor("Chetan Bhagat");
        b1.setPrice(300.00);
        b1.setPageCount(200);

        Book b2 = new Book("The Da Vinci Code","Dan Brown",600.00,1000);
        Book b3 = new Book("Angels and Demons","Dan Brown");

        //b1.setPrice(-3000.00);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);


    }
}
