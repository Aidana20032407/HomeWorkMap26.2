import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        City city1 = new City("New York",5);
        City city2 = new City("California",4);
        City city3 = new City("Texas",7);
        City city4 = new City("Virginia",8);
        City city5 = new City("Colorado",1);
        ArrayList<City> arrayList = new ArrayList<>(Arrays.asList(city1,city2,city3,city4,city5));
        TreeSet<City> cities = new TreeSet<>();
        System.out.print("arrayList :" + arrayList);
        Collections.sort(arrayList);
        for (City c : arrayList){
            if(c.getCode() % 2 != 0){
                cities.add(c);
            }
        }
        System.out.println("TreeSet :" + cities);
    }
}