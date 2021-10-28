package dz1;

public class Team {

    private final int MAX_PLAYERS = 3;
    private player[] players = new player[MAX_PLAYERS];
    private int size;
    private String teamName;
    private int playersCont;


    public Team(String teamName) {
        this.teamName = teamName;
    }

    public boolean addPlayer(player player) {
       if (playersCont == MAX_PLAYERS) {
           return false;
       }
       players[playersCont++] = player;
       return true;
   }
    public boolean addPlayer(player... players) {
        boolean result = true;

        for (player player : players) {
            result &= addPlayer(player);
        }

        return result;
    }

    public void printInfo() {
        int sumDist = 0;
        String playersInfo = "";
        for (int i = 0, playersLength = players.length; i < playersLength; i++) {
            player p = players[i];
            sumDist += p.getDistance();
            playersInfo += String.format(p.getName(), p.getName(), p.getDistance());
            if (i != size - 1) {
                playersInfo += ", ";
            }
        }

            System.out.printf("Команда %s прошла в общем %d дистанцию. Имена участников: %s%n ", teamName, sumDist, playersInfo);

    }
}
