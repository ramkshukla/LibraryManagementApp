package com.company;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException{
        System.out.println("Library Management System");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            System.out.println("Enter 1  to ADD Book to library");
            System.out.println("Enter 2 to Delete Book to library");
            System.out.println("Enter 3 to Update Book to library");
            System.out.println("Enter 4 to Display Book in library");
            System.out.println("Enter 5 to Exits");

            int c = Integer.parseInt(br.readLine());
            if (c == 1){
                System.out.println("Enter Book Id");
                int book_id = Integer.parseInt(br.readLine());

                System.out.println("Enter Book Name");
                String book_name = br.readLine();

                System.out.println("Enter Book Author name");
                String book_author_name = br.readLine();

                Library lib = new Library(book_id, book_name, book_author_name);
                boolean ans = BookDao.insertIntoBookDB(lib);
                if (ans){
                    System.out.println("Book " + book_name + "added successfully");
                }
                else{
                    System.out.println("Something went wrong");
                }
                System.out.println(lib);

            }
        }

    }
}
