
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        int count = 0, wins = 0, losses = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();

        System.out.println("Team:");
        String teamName = scan.nextLine();

        ArrayList<Games> records = readRecordsFromFile(file);

        for (Games record : records) {

            if (record.getHomeTeam().contains(teamName)) {
                count += 1;

                if (record.getHomePts() > record.getAwayPts()) {
                    wins += 1;
                    record.setWins();
                } else {
                    losses += 1;
                    record.setLoss();
                }
                record.playGame();

            } else if (record.getAwayTeam().contains(teamName)) {
                count += 1;

                if (record.getAwayPts() > record.getHomePts()) {
                    wins += 1;
                    record.setWins();
                } else {
                    losses += 1;
                    record.setLoss();
                }
                record.playGame();
            }
        }
        System.out.println("Games: " + count);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

    public static ArrayList<Games> readRecordsFromFile(String file) {
        ArrayList<Games> list = new ArrayList<>();

        try (Scanner fileRead = new Scanner(Paths.get(file))) {
            while (fileRead.hasNextLine()) {
                String line = fileRead.nextLine();

                String[] parts = line.split(",");

                String homeTeam = parts[0];
                String awayTeam = parts[1];
                int homePts = Integer.valueOf(parts[2]);
                int awayPts = Integer.valueOf(parts[3]);

                list.add(new Games(homeTeam, awayTeam, homePts, awayPts));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return list;
    }
}
