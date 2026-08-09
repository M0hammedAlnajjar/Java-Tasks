public class Book implements LibraryItem{

    private String title;
    private String author;
    private int pages;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {

            if (title == null || title.trim().isEmpty()) {
                System.out.println("Title cannot be empty.");
                return;
            }

            this.title = title;

        this.title = title;
    }

    @Override
    public String getLabel() {
        return "";
    }

    @Override
    public String getShelfCode() {
        return "";
    }

    @Override
    public void printAllInfo() {

    }

    public void setPages(int pages) {
        if (pages <= 0) {
            System.out.println("Pages must be above 0.");
            this.pages = 0;
            return;
        }

        this.pages = pages;
    }
}

