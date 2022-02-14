package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String title, author, isbn;
        int year, quantity;
        String name, surname, group;
        String id;
        Library l=new Library();

        int choice = -1;

        while (choice != 0) {
            System.out.println("Welcome to the AITU Library");
            System.out.println("1. Add book");
            System.out.println("2. Add student");
            System.out.println("3. Give book to student");
            System.out.println("4. Return book from student");
            System.out.println("5. Print books information");
            System.out.println("6. Print students information");
            System.out.println("7. Print student's books");
            System.out.println("0. Exit");

            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("String title, String author, String isbn, int year, int quantity");
                    title=sc.nextLine();
                    author=sc.nextLine();
                    isbn=sc.nextLine();
                    year=sc.nextInt();
                    quantity=sc.nextInt();
                    Book b = new Book(title, author, isbn, year, quantity);
                    try {
                        l.addBook(b);
                    } catch (NullPointerException dat){
                        System.out.println(dat.getMessage());
                    } catch (IsbnExistsException ken){
                        System.out.println(ken.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("String name, String surname, String group, String id");
                    name=sc.nextLine();
                    surname=sc.nextLine();
                    group=sc.nextLine();
                    id=sc.nextLine();
                    Student s = new Student(name, surname, group, id);
                    try {
                        l.addStudent(s);
                    } catch (NullPointerException bag){
                        System.out.println(bag.getMessage());
                    } catch (IdExistsException mar){
                        System.out.println(mar.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Enter id and isbn");
                    id =sc.nextLine();
                    isbn=sc.nextLine();
                    l.addBookToStudent(id, isbn);
                    break;
                case 4:
                    System.out.println("Enter id and isbn");
                    id =sc.nextLine();
                    isbn=sc.nextLine();
                    l.returnBookFromStudent(id, isbn);
                    break;
                case 5:
                    l.printBooksInformation();
                    break;
                case 6:
                    l.printStudentsInformation();
                    break;
                case 7:
                    System.out.println("Enter id");
                    id=sc.nextLine();
                    l.printStudentsBooks(id);
                    break;
            }
        }
    }
}
