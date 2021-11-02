package dz1.dz1;

public class  Player {

    private String Name;
    private int Distance;

    public  Player (String name, int distance) {
        Name = name;
        Distance = distance;
    }

    public Player() {

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
        return "Бегун" +
                " = " + Name + '\'' +
                " Дистанция > " + Distance +
                "";
    }




}
