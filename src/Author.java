import java.util.Objects;

public class Author {
    private String authorFirstName;
    private String authorLastName;

    public Author (String authorFirstName, String authorLastName) {
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }

    public String getAuthorFirstName () {
        return this.authorFirstName;
    }

    public String getAuthorLastName () {
        return this.authorLastName;
    }

    public String toString () {
        return "Имя автора: " + this.authorFirstName + ", фамилия автора: " + this.authorLastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this.getClass() != o.getClass()) {
            return false;
        }
        if (this == o) {
            return true;
        }
        Author author = (Author) o;
        return Objects.equals(authorFirstName, authorLastName);

    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(authorLastName);
    }

}
