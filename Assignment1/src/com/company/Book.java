package com.company;


// Question 9: Write a program to create a book class.
// The Book class would have following private variables: String name; int bookID; String genres; double price;
// Create a constructor to initialize the values. Create getters and setters for variables.


public class Book {
    // private variables
    String _name;
    int _bookID;
    String _genres;
    double _price;

    // constructor
    public Book(String name, int bookID, String genres, double price){
        _name = name;
        _bookID = bookID;
        _genres = genres;
        _price = price;
    }
    // getters
    public String getName(){ return _name;}
    public int getBookID(){ return _bookID;}
    public String getGenres(){ return _genres;}
    public double getPrice(){ return _price;}

    // setters
    public void setName(String name){_name = name;}
    public void setBookID(int bookID){_bookID = bookID;}
    public void setGenres(String genres){_genres = genres;}
    public void setPrice(double price){_price = price;}

    public void printBookInfo(){
        System.out.println("*************");
        System.out.println("Name: " + _name );
        System.out.println("BookID: " + _bookID);
        System.out.println("Genres: " + _genres);
        System.out.println("Price: " + _price);

    }


}
