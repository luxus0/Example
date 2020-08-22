package Travel;

public class Main {
    public static void main()
    {

    Traveler traveler = new Traveler("Robert"," Makłowicz");
    traveler.visit("Warsaw");
    traveler.visit("New York");
    traveler.visit("Brasilia");
    traveler.visit("Moscow");
    traveler.visit("Warsaw");
    traveler.visit("New York");

    System.out.println(traveler);

    }
}
