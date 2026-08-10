package LibraryCatalogue;

public class Magazine implements LibraryItem {


    private String name;
    private int issueNumber;
    private String month;


    public String getName() {
        return name;
    }


    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Name cannot be empty");
        }
    }



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
    public void printAllInfo() {
        System.out.println(
                "Magazine: " + name +
                        " | Issue " + issueNumber +
                        " | " + month
        );
    }

    @Override
    public String getLabel() {
        return "Magazine: " + name;
    }

    @Override
    public String getShelfCode() {
        return "M-01";
    }

    public static Magazine addMagazine() {

        Magazine magazine = new Magazine();

        String name = IO.readln("Enter magazine name: ");

        int issueNumber = Integer.parseInt(
                IO.readln("Enter issue number: ")
        );

        String month = IO.readln("Enter month: ");

        magazine.setName(name);
        magazine.setIssueNumber(issueNumber);
        magazine.setMonth(month);

        return magazine;
    }

}

