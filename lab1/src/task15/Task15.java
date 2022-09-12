package task15;

import task12.Book;

import java.util.*;


class BookTitleComparator implements Comparator<Book> {

    public int compare(Book book1, Book book2) {

        return book1.getTitle().compareTo(book2.getTitle());
    }
}

class BookAuthorComparator implements Comparator<Book> {

    public int compare(Book book1, Book book2) {

        return book1.getAuthor().compareTo(book2.getAuthor());
    }
}

class BookPriceComparator implements Comparator<Book> {

    public int compare(Book book1, Book book2) {

        return Integer.toString(book1.getPrice()).compareTo(Integer.toString(book2.getPrice()));
    }
}

public class Task15 {
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static TreeSet<Book> createTreeSetBooks(Comparator<Book> comparing, List<Book> books) {
        TreeSet<Book> booksForComparing = new TreeSet(comparing);
        booksForComparing.addAll(books);
        return booksForComparing;
    }

    public static void main(String[] args) {
        Book book1 = new Book("Мастер и Маргарита", "Булгаков Р.М.", 12, 1112, "123-123-123-1244");
        Book book2 = new Book("Собачье сердце", "Булгаков Р.М.", 10, 1231, "123-143-666-1560");
        Book book3 = new Book("Отцы и дети", "Тургенева И.С.", 18, 6584, "123-123-123-1230");
        List<Book> books = Arrays.asList(book1, book2, book3);
        System.out.println(ANSI_PURPLE+"ИСХОДНЫЕ ДАННЫЕ: "+ANSI_RESET);
        for (Book book : books)
            System.out.println("Название книги: " + book.getTitle() + " |Автор книги: " + book.getAuthor() + " |Цена книги: " + book.getPrice());


        //сортировка по названию
        Comparator<Book> comparingByTitle = new BookTitleComparator();
        var booksForComparingByTitle = createTreeSetBooks(comparingByTitle, books);
        System.out.println(ANSI_PURPLE+"\nСортировка по названию книг: "+ANSI_RESET);
        for (Book book : booksForComparingByTitle)
            System.out.println("Название книги: " + book.getTitle() + ";");


        //сортировка по названию, а потом по автору
        Comparator<Book> comparingByTitleAndAuthor = new BookTitleComparator().thenComparing(new BookAuthorComparator());
        var booksForComparingByTitleAndAuthor = createTreeSetBooks(comparingByTitleAndAuthor, books);
        System.out.println(ANSI_PURPLE+"\nСортировка по названию книг, а потом по автору: "+ANSI_RESET);
        for (Book book : booksForComparingByTitleAndAuthor)
            System.out.println("Название книги: " + book.getTitle() + " |Автор книги: " + book.getAuthor() + ";");


        //сортировка по автору, а потом по названию
        Comparator<Book> comparingByAuthorAndTitle = new BookAuthorComparator().thenComparing(new BookTitleComparator());
        var booksForComparingByAuthorAndTitle = createTreeSetBooks(comparingByAuthorAndTitle, books);
        System.out.println(ANSI_PURPLE+"\nСортировка по автору книг, а потом по названию: "+ANSI_RESET);
        for (Book book : booksForComparingByAuthorAndTitle)
            System.out.println("Название книги: " + book.getTitle() + " |Автор книги: " + book.getAuthor() + ";");


        //сортировка по автору, названию и по цене
        Comparator<Book> comparingByAuthorAndTitleAndPrice = new BookAuthorComparator().thenComparing(new BookTitleComparator()).thenComparing(new BookPriceComparator());
        var booksForComparingByAuthorAndTitleAndPrice = createTreeSetBooks(comparingByAuthorAndTitleAndPrice, books);
        System.out.println(ANSI_PURPLE+"\nСортировка по автору книг, названию и по цене: "+ANSI_RESET);
        for (Book book : booksForComparingByAuthorAndTitleAndPrice)
            System.out.println("Название книги: " + book.getTitle() + " |Автор книги: " + book.getAuthor() + " |Цена книги: " + book.getPrice());
    }
}
