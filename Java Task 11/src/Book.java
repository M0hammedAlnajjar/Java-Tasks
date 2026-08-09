public class Book implements LibraryItem{

    private String title;
    private String author;
    private int pages;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
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
}

