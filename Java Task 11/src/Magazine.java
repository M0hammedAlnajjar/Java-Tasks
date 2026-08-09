public class Magazine implements LibraryItem {


    private String name;
    private int issueNumber;
    private String month;

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        if (issueNumber >= 1 && issueNumber <= 500) {
            this.issueNumber = issueNumber;
        } else {
            System.out.println("Invalid issue number");
        }
    }




    public String getMonth() {
        return month;
    }
    public void setMonth(String month) {
        this.month = month;
    }


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
