package Travel;

import java.util.HashSet;
import java.util.Set;

public class Traveler {

    private String name;
    private String surname;

    Set<String> cities = new HashSet<>();

    public Traveler(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    void visit(String city)
    {
        cities.add(city);
    }

    @Override
    public String toString() {
       String result = name + surname + "has already been in: ";
       for(String city : cities)
       {
           result+= "*" + city;
       }

       return result;
    }
}
