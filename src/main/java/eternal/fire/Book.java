package eternal.fire;

public class Book {
    private String name;
    private String author;
    private String isbn;
    private String publishDate;

    public Book() {

    }

    public Book(String name, String author, String isbn, String publishDate) {
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.publishDate = publishDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }
}
