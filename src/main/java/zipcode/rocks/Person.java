package zipcode.rocks;

public class Person {
    private String firstname;
    private String lastname;
    private String favBeverage;
    private String favColor;
    private String birthMonth;
    private boolean hasPets;

    public Person(String fname, String lname) {
        this.firstname = fname;
        this.lastname = lname;
        this.favBeverage = favBeverage;
        this.favColor = favColor;
        this.birthMonth = birthMonth;
        this.hasPets = hasPets;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String toString() {
        return this.lastname + ", " + this.firstname + ", " + this.favBeverage + ", " + this.favColor + ", " + this.birthMonth + ", Pets?: " + this.hasPets;
    }

    public String getFavBeverage() { return favBeverage;}

    public void setFavBeverage(String favBeverage) {this.favBeverage = favBeverage;};

    public String getFavColor() {return favColor;};
    public void setFavColor(String favColor) {this.favColor = favColor;};

    public String getBirthMonth() {return birthMonth;};
    public void setBirthMonth(String birthMonth){this.birthMonth = birthMonth;};

    public boolean getHasPets(){return hasPets;};
    public void setHasPets(boolean hasPets){this.hasPets = hasPets;};









}
