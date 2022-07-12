package com.tomek;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("Ars", "Ktos", 1987);
        Book book2 = new Book("Brs", "Khftrv", 1988);
        Book book3 = new Book("crs", "Jksdjie", 1989);
        Book book4 = new Book("drs", "lkosndu", 1990);
        Book book5 = new Book("Ers", "Wastqqmf", 1994);
        Book book6 = new Book("Frs", "Tweotr", 1999);
        Book book7 = new Book("Grs", "Rzdae", 2000);
        Book book8 = new Book("Hrs", "Kkhhys", 2001);
        Book book9 = new Book("Nrs", "Wraoc", 2002);
        Book book10 = new Book("Lrs", "Klos", 2003);

        HashSet<Book> bookHashSet = new HashSet<>();
        bookHashSet.add(book1);
        bookHashSet.add(book2);
        bookHashSet.add(book3);
        bookHashSet.add(book4);
        bookHashSet.add(book5);
        bookHashSet.add(book6);
        bookHashSet.add(book7);
        bookHashSet.add(book8);
        bookHashSet.add(book9);
        bookHashSet.add(book10);

        for (Book book : bookHashSet) {
            if (book.getPublishYear() < 2000) {
                System.out.println(book);
            }
        }
        List<Book> bookList = new ArrayList<Book>(bookHashSet);

        Collections.sort(bookList, Comparator
                .comparing((Book x) -> x.getPublishYear()));
        System.out.println("Posortowany SET");

        for (Book book : bookList) {
            if (book.getPublishYear() > 1999) {
                System.out.println(book);
            }
        }
    }
}
