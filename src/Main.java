public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Дядя", "Ваня");

        Book book1 = new Book("История длиною в жизнь", 2002, author1);
        Book book2 = new Book("Рассказы бабок у подъезда", 2020, new Author("Тётя", "Мотя")); //можно и так

        Author author2 = new Author("Тётя", "Мотя");
        Book book3 = new Book("Рассказы бабок у подъезда", 2020, author2);

        book1.setYear(2010);
        System.out.println(book2);

        System.out.println(book2.hashCode() + " == " + book3.hashCode());

        if (book3.equals(author2)) {
            System.out.println("Книги одинаковые");
        } else {
            System.out.println("Книги разные");
        }
    }
}