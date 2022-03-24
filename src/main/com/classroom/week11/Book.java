package com.classroom.week11;

import java.util.*;

public class Book  implements Comparable<Book>{
    private final String name;
    private final double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(book.price, price) == 0 && Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    public static void main(String[] args) {
        Set<Book> books = Set.of(
                new Book("effective", 54.99)
        );

        Set<Book> books1 = new TreeSet<>();


        books1.add( new Book("effective", 54.99));
        books1.add( new Book("apush@", 51.99));
        Book book = new Book(args[0], Double.parseDouble(args[1]));
        System.out.println(books.contains(book));
    }


    @Override
    public int compareTo(Book o) {
        return 0;
    }
}
