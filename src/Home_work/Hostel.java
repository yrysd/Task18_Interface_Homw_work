package Home_work;

public class Hostel extends Person implements Family{
    public Hostel(String address, int personNumber) {
        super(address, personNumber);
    }



    @Override
    public void publicService() {

    }

    @Override
    public void rent() {
        System.out.println("Rent : "+12000);

    }

    @Override
    public void address() {
        System.out.println("Address : Hostel");

    }

}
