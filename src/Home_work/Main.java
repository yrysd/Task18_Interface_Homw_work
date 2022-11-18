package Home_work;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        Flat flat = new Flat();
//        flat.publicService();
//        flat.address();
//        flat.rent();
//
//        Hostel hostel = new Hostel();
//        hostel.address();
//        hostel.rent();
//
//        Hotel hotel = new Hotel();
//        hotel.address();
//        hotel.rent();


//        Family [] arrays ={
//                new Hostel("Flat Emakom",6),
//                new Flat("Hostel Kochmon",10),
//                new Hotel("Hotel Ak orgo",4)
//        } ;
//
//        for (Family family:arrays) {
//
//
//        }

        Home []homes= {new Hostel("Flat Emakom",6),
                new Flat("Hostel Kochmon",10),
                new Hotel("Hotel Ak orgo",4)};


        for (Home home:homes) {
            home.method();
            home.publicService();
            home.address();
            home.rent();
            System.out.println("================================================");


        }
    }

}