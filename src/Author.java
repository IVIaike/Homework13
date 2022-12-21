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

}
