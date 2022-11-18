package Home_work;

public class Flat extends Home  {
    public Flat(String address, int personNumber) {
        super(address, personNumber);

    }

    @Override
    public void method() {
        super.method();
    }

    @Override
    public void publicService() {

        System.out.println("Public service: 5000");

    }

    @Override
    public void rent() {
        System.out.println("Rent: No");

    }

    @Override
    public void address() {
        System.out.println("Address: Flat");

    }
}
