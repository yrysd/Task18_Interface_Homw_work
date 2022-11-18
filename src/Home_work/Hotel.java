package Home_work;

public class Hotel extends Home{
    public Hotel(String address, int personNumber) {
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
        System.out.println("Rent: "+30000);

    }

    @Override
    public void address() {
        System.out.println("Address: Hotel");

    }
}
