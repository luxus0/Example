package Hotel;

import Hotel.Apartment;

import java.util.LinkedList;

public class Main {

    public static void main(String args[])
    {
        LinkedList<Apartment> apartments = new LinkedList<>();
        apartments.add(new Apartment("Warsaw",50f,10000.00f));
        apartments.add(new Apartment("Cracow",65f,12000.00f));
        apartments.add(new Apartment("Gdańsk",70f,13000.00f));
        apartments.add(new Apartment("Bydgoszcz",48f,9000.00f));

        for (Apartment apartment : apartments) {
            System.out.println("Hotel.Apartment in " +apartment.getCity() + " cost: " +apartment.getFullPrice());
        }
    }
}
