package Home_work;

public class Person  {
    public String address;
    public int PersonNumber;

    public Person(String address, int personNumber) {
        this.address = address;
        PersonNumber = personNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPersonNumber() {
        return PersonNumber;
    }

    public void setPersonNumber(int personNumber) {
        PersonNumber = personNumber;
    }
}
