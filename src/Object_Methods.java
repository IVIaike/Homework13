public class Object_Methods {
    public static void main(String[] args) {

        System.out.println("Задание Методы объектов");
        Author authorBook1 = new Author("Марк", "Mенсон");
        Author authorBook2 = new Author("Роберт", "Кийосаки");
        Book book1 = new Book("Тонкое искусство пофигизма", new Author(authorBook1.getAuthorFirstName(), authorBook1.getAuthorLastName()), 2012);
        Book book2 = new Book("Второй шанс", new Author(authorBook2.getAuthorFirstName(), authorBook2.getAuthorLastName()), 2015);
        System.out.println(book1.getBookTitle() + " " + authorBook1.getAuthorFirstName() + " " + authorBook1.getAuthorLastName() + " " + book1.getPublishingYear());
        System.out.println(book2.getBookTitle() + " " + authorBook2.getAuthorFirstName() + " " + authorBook2.getAuthorLastName() + " " + book2.getPublishingYear());
        book1.setPublishingYear(2021);
        System.out.println(book1.getBookTitle() + " " + authorBook1.getAuthorFirstName() + " " + authorBook1.getAuthorLastName() + " " + book1.getPublishingYear());

    }
}