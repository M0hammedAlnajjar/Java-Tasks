public class Magazine implements LibraryItem {


    private String name;
    private int issueNumber;
    private String month;


    @Override
    public String getLabel() {
        return "";
    }

    @Override
    public String getShelfCode() {
        return "";
    }

    public Magazine() {
    }

    @Override
    public void printAllInfo() {

    }
}
