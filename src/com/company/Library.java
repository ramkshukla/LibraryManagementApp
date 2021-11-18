package com.company;

public class Library{
    private int book_id;
    private String book_name;
    private String book_author_name;

    public int getBook_id(){
        return book_id;
    }
    public void setBook_id(int book_id){
        this.book_id = book_id;
    }

    public String getBook_name(){
        return book_name;
    }
    public void setBook_name(String book_name){
        this.book_name = book_name;
    }

    public String getBook_author_name(){
        return book_author_name;
    }
    public void setBook_author_name(String book_author_name){
        this.book_author_name = book_author_name;
    }

    public Library(int book_id, String book_name, String book_author_name){
        super();
        this.book_id = book_id;
        this.book_name = book_name;
        this.book_author_name = book_author_name;
    }

    public Library(String book_name, String book_author_name){
        super();
        this.book_name = book_name;
        this.book_author_name = book_author_name;
    }
    public Library(){
        super();
    }

    @Override
    public String toString(){
        return "Book [BookId" + book_id + ", Book_name" + book_name + " Boook_Author_Name "  + book_author_name + "]";
    }
}