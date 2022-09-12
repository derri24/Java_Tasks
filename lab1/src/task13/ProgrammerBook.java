package task13;

import task12.Book;

import java.util.Objects;

public class ProgrammerBook extends Book {

    public ProgrammerBook(String title, String author, int price, int edition, String isbn, String language, int level) {
        super(title, author, price, edition,isbn);
        this.level = level;
        this.language = language;
    }

    private String language;
    private int level;

    @Override
    public boolean equals(Object obj) {
        Book book=(Book)obj;
        return obj != null
                && (book.getEdition() == this.getEdition()
                && Objects.equals(book.getAuthor(), this.getAuthor())
                && Objects.equals(book.getTitle(), this.getTitle()));
    }

    @Override
    public int hashCode() {
        return Math.abs(this.getTitle().hashCode() * this.getAuthor().hashCode() * this.getPrice() + this.getEdition()
                * this.level * this.language.hashCode());
    }

    @Override
    public String toString() {
        return "Название: " + this.getTitle() + "\nАвтор: " + this.getAuthor() + "\nЯзык: " + this.language
                + "\nУровень: " + this.level;
    }

}
