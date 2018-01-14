package model;

public class ContactData {
    private final String name;
    private final String lname;
    private final String middlename;
    private final String work;
    private final String address;

    public ContactData(String name, String lname, String middlename, String work, String address) {
        this.name = name;
        this.lname = lname;
        this.middlename = middlename;
        this.work = work;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getLname() {
        return lname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getWork() {
        return work;
    }

    public String getAddress() {
        return address;
    }
}