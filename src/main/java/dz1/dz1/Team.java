package dz1.dz1;

import java.util.ArrayList;

public class Team extends Player {

    private ArrayList<Player> people = new ArrayList<>();
    private String teamName;
    private Player player;



    public Team(String teamName, Player a, Player b, Player c) {
        this.teamName = teamName;
        this.people.add(a);
        this.people.add(b);
        this.people.add(c);
    }

    public Team(String teamName) {
        this.teamName = teamName;

    }



    public boolean printInfo (){
        System.out.println(people);
        return true;
    }




}
