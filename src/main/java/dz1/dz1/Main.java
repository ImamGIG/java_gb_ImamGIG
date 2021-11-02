package dz1.dz1;

public class Main {


    public static void main(String[] args) {

        Player participants1 = new Player("Алена",25);
        Player participants2 = new Player("Алексей",30);
        Player participants3 = new Player("Рома",15);

        Team team = new Team("Бегуны",participants1, participants2,participants3);

        System.out.println(team.printInfo());


    }


}
