package Home_work;

public class Flat extends Person implements Family {
    public Flat(String address, int personNumber) {
        super(address, personNumber);
    }

    @Override
    public void publicService() {
        System.out.println("public service");
    }

    @Override
    public void rent() {

    }
    public void address(){
        System.out.println("Address: Flat");
    }
}
