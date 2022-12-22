import java.util.Objects;

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

    public String toString() {
        return "Название книги: " + this.bookTitle + ", автор " + this.authorBook.getAuthorFirstName() + " " +  this.authorBook.getAuthorLastName() + ", издание " + this.publishingYear + " года.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookTitle.equals(book.bookTitle) && authorBook.equals(book.authorBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, authorBook);
    }
}
