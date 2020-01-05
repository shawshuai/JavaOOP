import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input_city;
        int input_distance;
        City c = new City();
        int numOfCity = -1;
        do {
            input_city = in.next().toString();
            c.add(input_city);
            numOfCity+=1;
        } while(!input_city.equalsIgnoreCase("###"));
        Distance d = new Distance(numOfCity);
        for(int i=0;i<numOfCity;i++){
            for(int j=0;j<numOfCity;j++){
                input_distance = in.nextInt();
                d.addDistance(i, j, input_distance);
            }
        }
        String test1 = in.next();
        String test2 = in.next();
        int index1 = c.geIndex(test1);
        int index2 = c.geIndex(test2);
        int result = d.getDistance(index1, index2);
        if(test1 == test2) {
            result = 0;
        }
        System.out.println(result);
    }

}

class City {
    private ArrayList<String> citylist = new ArrayList<String>();

    public void add(String city_name) {
        this.citylist.add(city_name);
    }

    public int geIndex(String city_name) {
        int index = 0;
        index = this.citylist.indexOf(city_name);
        return index;
    }
}

class Distance {
    private int[][] distance;

    public Distance(int num) {
        int[][] dis = new int[num][num];
        this.distance =dis;
    }

    public void addDistance(int hang, int lie, int distance) {
        this.distance[hang][lie] = distance;
    }

    public int getDistance(int hang, int lie) {
        int distance=0;
        distance = this.distance[hang][lie];
        return distance;
    }
}