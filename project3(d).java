package com.company;

import java.util.ArrayList;

public class Student extends ArrayList<Book> {
    private String name;
    private String surname;
    private String group;
    private String id;
    private int quantity=0;
    private ArrayList<Book> book;

    public Student(String name, String surname, String group, String id) {
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.id = id;
        book=new ArrayList<>();
    }

    public int getQuantity() {return quantity;}

    public void setQuantity(int quantity) {this.quantity = quantity;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getSurname() {return surname;}

    public void setSurname(String surname) {this.surname = surname;}

    public String getGroup() {return group;}

    public void setGroup(String group) {this.group = group;}

    public String getId() {return id;}

    public void setId(String id) {this.id = id;}

    public void borrowBook(Book b) throws NullPointerException, TitleExistsException{
        if(b==null){
            throw new NullPointerException("b=null!");
        }
        for(int i=0; i< book.size(); i++){
            if(book.get(i).getTitle().equals(b.getTitle())){
                throw new TitleExistsException("This book is already taken by this student!");
            }
        }book.add(b);}

    public void returnBook(Book b) {
        book.remove(b);
    }

    public void printBooks() {
        for (int i=0; i<book.size(); i++){
            System.out.println(book.get(i).getIsbn()+" "+book.get(i).getTitle());
        }
    }
}
