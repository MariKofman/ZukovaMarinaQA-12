package model;

public class ContactData {
    private final String marina;
    private final String qwert;
    private final String marina1;
    private final String hitec;
    private final String beersheva;

    public ContactData(String marina, String qwert, String marina1, String hitec, String beersheva) {
        this.marina = marina;
        this.qwert = qwert;
        this.marina1 = marina1;
        this.hitec = hitec;
        this.beersheva = beersheva;
    }

    public String getMarina() {
        return marina;
    }

    public String getQwert() {
        return qwert;
    }

    public String getMarina1() {
        return marina1;
    }

    public String getHitec() {
        return hitec;
    }

    public String getBeersheva() {
        return beersheva;
    }
}
