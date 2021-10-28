package dz1;

public class main {

    public static void main(String[] args) {

        Participants.Participants1 participants1 = new Participants.Participants1("Алена",25);
        Participants.Participants2 participants2 = new Participants.Participants2("Алексей",30);
        Participants.Participants3 participants3 = new Participants.Participants3("Рома",15);

    Team team = new Team("Бегуны");

        System.out.println("++++" + team.addPlayer(participants1,participants2,participants3));
        team.printInfo();

    }


}
