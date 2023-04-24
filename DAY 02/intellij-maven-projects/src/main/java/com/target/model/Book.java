package com.target.model;

public class Book {
    private String title;
    private String author;
    private int pageCount;
    private double price;

    public void setTitle(String t){
        this.title = t;
    }

    public String getTitle(){
        return this.title;
    }

    public void setAuthor(String a){
        this.author = a;
    }

    public String getAuthor(){
        return this.author;
    }

    public void setPageCount(int count){
        this.pageCount = count;
    }

    public int getPageCount(){
        return this.pageCount;
    }

    public void setPrice(double p){
        this.price = p;
    }

    public double getPrice(){
        return this.price;
    }
}
