import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        do {
            City cti = new City();
            cti.add(in.next().toString());
        } while (in.next() != "###");
        Distance[] dis = new Distance[cti.size()];
        for (int i = 0; i < cti.size(); i++) {
            for (int j = 0; j < cti.size(); j++) {
                dis[i].add(in.nextInt);
            }
        }
        String city1 = in.next();
        String city2 = in.next();
        arrayList.indexOf(city1);
        arrayList.indexOf(city2);
    }

}

class City {
    int city_number = 0;
    private ArrayList<String> city = new ArraryList<String>();

    public void add(String c) {
        this.city.add(c);
    }

    public int getIndex(String city) {
        int index;
        for (String i:this.city) {
            if ( this.city[i] == city) {

            }
        }
        return index;
    }
}

class Distance {
    private ArrayList<Int> distance = new ArrayList<Int>();

    public int getDistance() {

    }
}