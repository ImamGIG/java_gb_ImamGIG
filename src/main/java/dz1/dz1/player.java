package dz1;

public class player {

    private String Name;
    private int Distance;

    public player(String name, int distance) {
        Name = name;
        Distance = distance;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getDistance() {
        return Distance;
    }

    public void setDistance(int distance) {
        Distance = distance;
    }

    @Override
    public String toString() {
        return "Участники проходят дистанцию" +
                 " Имя='" + Name + '\'' +
                ", На дистанцию = " + Distance +
                 " Метров";
    }
    public void printInfo() {
        System.out.println( ": " + this);
    }
}

