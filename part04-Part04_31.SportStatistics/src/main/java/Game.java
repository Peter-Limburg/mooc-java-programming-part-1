public class Game {

        private String homeTeam;
        private String visitorTeam;
        private int homeScore;
        private int visitorScore;

    public Game(String homeTeam, String visitorTeam, int homeScore, int visitorScore) {
        this.homeTeam = homeTeam;
        this.visitorTeam = visitorTeam;
        this.homeScore = homeScore;
        this.visitorScore = visitorScore;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getVisitorTeam() {
        return visitorTeam;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public int getVisitorScore() {
        return visitorScore;
    }
}

