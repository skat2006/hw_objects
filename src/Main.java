public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Дядя", "Ваня");

        Book book1 = new Book("История длиною в жизнь", 2002, author1);
        Book book2 = new Book("Рассказы бабок у подъезда", 2020, new Author("Тётя", "Мотя")); //можно и так

        book2.setYear(2010);
        System.out.println(book2);

        System.out.println(book2.hashCode() + " == " + book1.hashCode());
    }
}