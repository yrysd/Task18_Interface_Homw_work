package Home_work;

public class Hotel extends Person implements Family{
    public Hotel(String address, int personNumber) {
        super(address, personNumber);
    }

    @Override
    public void publicService() {

    }

    @Override
    public void rent() {
        System.out.println("Rent: "+30000);

    }

    @Override
    public void address() {
        System.out.println("Address: Hotel");

    }
}