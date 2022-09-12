package task12;


public class Book implements Cloneable, Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private int edition;

    private String isbn;

    String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPrice() {
        return this.price;
    }

    public int getEdition() {
        return this.edition;
    }

    public Book(String title, String author, int price, int edition, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.edition = edition;
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object obj) {
        if (((Book) obj).getEdition() == this.getEdition())
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        return Math.abs(title.hashCode() * author.hashCode() * price + edition);
    }

    @Override
    public String toString() {
        return "Название: " + this.title + "\nАвтор: " + this.author;
    }

    @Override
    public Book clone() throws CloneNotSupportedException {
        return (Book) super.clone();
    }

    public int compareTo(Book book) {

        return isbn.compareTo(book.getIsbn());
    }


}

