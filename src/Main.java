public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Дядя",  "Ваня");

        Book book1 = new Book("История длиною в жизнь", 2002, author1);
        Book book2 = new Book("Рассказы бабок у подъезда", 2020, new Author("Тётя", "Мотя")); //можно и так

        book2.setYear(2010);
        System.out.println(book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() + " пишет в книге "
                            + book2.getTitle() + " о том, как слушала рассказы дворовых бабок по "
                            + book2.getYear() + " год.");
    }
}