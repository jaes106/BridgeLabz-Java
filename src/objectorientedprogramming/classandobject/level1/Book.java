package objectorientedprogramming.classandobject.level1;

import java.util.Scanner;

class Book {

    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter book title: ");
        String title = sc.nextLine();
        System.out.print("Enter author name: ");
        String author = sc.nextLine();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        Book book = new Book(title, author, price);
        book.displayDetails();
    }
}
