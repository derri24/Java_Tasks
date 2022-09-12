package task14;

import task12.Book;

public class Task14 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Book book1 = new Book("Мастер и Маргарита", "Булгаков Р.М.", 12, 1112,"123-123-123-1244");
        //проверка clone() - задание 14(часть 1)
        Book book2 = (Book) book1.clone();
        book2.setTitle("другое название");
        System.out.println(book1.getTitle());

        //проверка compareTo() - задание 14(часть 2)
        Book book3 = new Book("Отцы и дети", "Тургенева И.С.", 12, 6584,"123-123-123-1230");
        System.out.println(book1.compareTo(book3));
    }

}
