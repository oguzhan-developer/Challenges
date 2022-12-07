package BookSorter;

public class Book {
    private String name, authorName;
    private int pageNumber, date;

    public Book(String name, String authorName, int pageNumber, int date) {
        this.name = name;
        this.authorName = authorName;
        this.pageNumber = pageNumber;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
