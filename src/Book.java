public class Book {
    private String bookTitle;
    private Author authorBook;
    private int publishingYear;

    public Book (String bookTitle, Author authorBook, int publishingYear) {
        this.bookTitle = bookTitle;
        this.authorBook = new Author(authorBook.getAuthorFirstName(), authorBook.getAuthorLastName());
        this.publishingYear = publishingYear;
    }

    public String getBookTitle () {
        return this.bookTitle;
    }

    public Author getAuthorBook () {
        return this.authorBook;
    }

    public int getPublishingYear () {
        return this.publishingYear;
    }

    public void setPublishingYear (int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
