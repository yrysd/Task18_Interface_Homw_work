package Home_work;

public class Hostel extends Home{
    public Hostel(String address, int personNumber) {
        super(address, personNumber);
    }


    @Override
    public void method() {
        super.method();
    }

    @Override
    public void publicService() {
        System.out.println("Public service: No");

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
