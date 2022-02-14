package com.company;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> book;
    private ArrayList<Student> student;

    public Library() {
        book = new ArrayList<>();
        student = new ArrayList<>();
    }

    public void addBook(Book b) throws NullPointerException, IsbnExistsException {
        if(b==null){
            throw new NullPointerException("b=null!");
        }
        for(int i=0; i< book.size(); i++){
            if(book.get(i).getIsbn().equals(b.getIsbn())){
                throw new IsbnExistsException("ISBN is already taken!");
            }
        }
        book.add(b);
        System.out.println(b.getIsbn() + " added successfully!");
    }

    public void addStudent(Student s) throws NullPointerException, IdExistsException {
        if(s==null){
            throw new NullPointerException("s=null!");
        }
        for(int i=0; i<student.size(); i++){
            if(student.get(i).getId().equals(s.getId())){
                throw new IdExistsException("Surname is already taken");
            }
        }
        student.add(s);
        System.out.println(s.getId() + " added successfully!");
    }

    public int increaseBookQuantity(int i) {
        return book.get(i).getQuantity() + 1;
    }

    public int decreaseBookQuantity(int i) {
        return book.get(i).getQuantity()-1;
    }

    public void addBookToStudent(String id, String isbn) {
        for (int i = 0; i < student.size(); i++) {
            if (student.get(i).getId().equals(id)) {
                for (int j = 0; j < book.size(); j++) {
                    if (book.get(j).getIsbn().equals(isbn)) {
                        try {
                            student.get(i).borrowBook(book.get(j));
                        } catch (TitleExistsException e) {
                            e.printStackTrace();
                        }
                        System.out.println("Done!");
                            if(book.get(i).getQuantity()==0){
                                System.out.println("we dont have this book");
                            } else {
                                decreaseBookQuantity(i);
                            }
                        }
                    }
                }
            }
        }

    public void returnBookFromStudent(String id, String isbn) {
        for (int i = 0; i < student.size(); i++) {
            if (student.get(i).getId().equals(id)) {
                for (int j = 0; j < book.size(); j++) {
                    if (book.get(j).getIsbn().equals(isbn)) {
                        student.get(i).returnBook(book.get(j));
                        System.out.println("remove!");
                        increaseBookQuantity(i);
                    }
                }
            }
        }
    }

    public void printBooksInformation() {
        int amount=0;
        for (int i = 0; i < book.size(); i++) {
            System.out.println(book.get(i).getTitle() + " " + book.get(i).getAuthor() + " " + book.get(i).getIsbn() + " " + book.get(i).getYear() + " " + book.get(i).getQuantity());
            amount=i+1;
        }
        System.out.println("Total amount of books:" + amount);
    }

    public void printStudentsInformation() {
        int amount=0;
        for (int i = 0; i < student.size(); i++) {
            System.out.println(student.get(i).getName() + " " + student.get(i).getSurname() + " " + student.get(i).getGroup() + " " + student.get(i).getId());
            amount=i+1;
        }
        System.out.println("Total amount of students:" + amount);
    }

    public void printStudentsBooks(String id) {
        for (int i = 0; i < student.size(); i++) {
            if (student.get(i).getId().equals(id)) {
                    student.get(i).printBooks();
            }
        }
    }
}