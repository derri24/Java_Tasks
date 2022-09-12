package task13;

import task12.Book;

public class Task13 {

    public static void main(String[] args) {
        Book book1 = new ProgrammerBook("JAVA", "Кэти Сьерра.", 21, 5656,"123-123-123-1432","java",5);
        Book book2 = new ProgrammerBook(".NET", "Джуст Виссер", 44, 1661,"123-123-123-1432","C#",10);

        System.out.println("Хэш-код: " + book1.hashCode());
        System.out.println("Результат сравнения первой и второй книги " + book1.equals(book2));
        System.out.println(book1.toString());
    }


}
