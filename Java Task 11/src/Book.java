public class Book implements LibraryItem{

    private String title;
    private String author;
    private int pages;


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

