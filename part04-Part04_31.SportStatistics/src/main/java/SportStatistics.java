
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String targetTeam = scan.nextLine();

        ArrayList<Game> games = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(Paths.get(file))) {

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String visitorTeam = parts[1];
                int homeScore = Integer.valueOf(parts[2]);
                int visitorScore = Integer.valueOf(parts[3]);

                games.add(new Game(homeTeam, visitorTeam, homeScore, visitorScore));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        int gamesPlayed = 0;
        int wins = 0;

        for (Game match : games) {

            if (targetTeam.equals(match.getHomeTeam()) || targetTeam.equals(match.getVisitorTeam())) {
                gamesPlayed++;
                if ((targetTeam.equals(match.getHomeTeam()) && match.getHomeScore() > match.getVisitorScore()) ||
                        (targetTeam.equals(match.getVisitorTeam()) && match.getVisitorScore() > match.getHomeScore())) {
                    wins++;
                }
            }
        }
        int losses = gamesPlayed - wins;

        System.out.println("Games: " + gamesPlayed);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
}



