package com.company;

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

    public String toString(){
        return "Name: " + _name + "\n" + "BookID: " + _bookID + "\n" +
                "Genres: " + _genres + "\n" + "Price: " + _price + "\n";
    }


}
