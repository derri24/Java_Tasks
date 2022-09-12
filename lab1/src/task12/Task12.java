package task12;

public class Task12 {

    public static void main(String[] args) {
        Book book1 = new Book("Мастер и Маргарита", "Булгаков Р.М.", 12, 1112,"123-143-123-1564");
        Book book2 = new Book("Собачье сердце", "Булгаков Р.М.", 10, 1231,"123-143-666-1560");

        System.out.println("Хэш-код: " + book1.hashCode());
        System.out.println("Результат сравнения первой и второй книги " + book1.equals(book2));
        System.out.println(book1.toString());
    }
}
