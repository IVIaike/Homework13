public class Object_Methods {
    public static void main(String[] args) {

        System.out.println("Задание Методы объектов");
        //Реализуйте методы toString, equals и hashCode в классах Author и Book, которые вы создали на прошлом уроке.
        Author authorBook1 = new Author("Марк", "Mенсон");
        Author authorBook2 = new Author("Роберт", "Кийосаки");
        Book book1 = new Book("Тонкое искусство пофигизма", new Author(authorBook1.getAuthorFirstName(), authorBook1.getAuthorLastName()), 2012);
        Book book2 = new Book("Второй шанс", new Author(authorBook2.getAuthorFirstName(), authorBook2.getAuthorLastName()), 2015);
        //System.out.println(book1.getBookTitle() + " " + authorBook1.getAuthorFirstName() + " " + authorBook1.getAuthorLastName() + " " + book1.getPublishingYear());
        //System.out.println(book2.getBookTitle() + " " + authorBook2.getAuthorFirstName() + " " + authorBook2.getAuthorLastName() + " " + book2.getPublishingYear());
        //book1.setPublishingYear(2021);
        //System.out.println(book1.getBookTitle() + " " + authorBook1.getAuthorFirstName() + " " + authorBook1.getAuthorLastName() + " " + book1.getPublishingYear());

        System.out.println(book1);
        System.out.println(authorBook1);
        System.out.println(book2);
        System.out.println(authorBook2);
        book1.setPublishingYear(2021);
        System.out.println(book1);

        //Конец работы с методом toString

        System.out.println(book1.equals(book2));
        System.out.println(book1.equals(book1));
        System.out.println(authorBook1.equals(authorBook1));
        System.out.println(authorBook1.equals(authorBook2));

        //Конец работы с методом equals

        boolean isBookHashcodeEquals = book1.hashCode() == book2.hashCode();
        System.out.println("Код 1: " + book1.hashCode() + " Код 2: " + book2.hashCode());

        boolean isAuthorHashcodeEquals = authorBook1 == authorBook2;
        System.out.println("Код 1: " + authorBook1.hashCode() + " Код 2: " + authorBook2.hashCode());

        //конец работы с методом hashCode
    }
}