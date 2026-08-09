public class Book implements LibraryItem {

    private String title;
    private String author;
    private int pages;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null && !title.trim().isEmpty()) {
            this.title = title;
        } else {
            System.out.println("Name cannot be empty");
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if (pages > 0) {
            this.pages = pages;
        } else {
            this.pages = 0;
            System.out.println("Pages must be above 0");
        }
    }

    @Override
    public void printAllInfo() {
        System.out.println(
                "Book: " + title +
                        " by " + author +
                        " (" + pages + " pages)"
        );
    }

    @Override
    public String getLabel() {
        return "Book: " + title + " by " + author;
    }

    @Override
    public String getShelfCode() {
        return "B-01";
    }
}