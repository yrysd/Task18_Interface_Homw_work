package Home_work;

public abstract class Home implements Family{

    public String address;
    public int PersonNumber;

    public Home(String address, int personNumber) {
        this.address = address;
        PersonNumber = personNumber;
    }

    public void method(){
        System.out.println("Address: "+getAddress());
        System.out.println("Person number: "+getPersonNumber());
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
