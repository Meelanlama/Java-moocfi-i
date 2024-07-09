/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meelan
 */
public class Games {

    private  String homeTeam, awayTeam;
    private  int homePts, awayPts, gamesPlayed, wins, loss;

    public Games(String homeTeam, String awayTeam, int homePts, int awayPts) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homePts = homePts;
        this.awayPts = awayPts;
    }

    public String getHomeTeam() {
        return this.homeTeam;
    }

    public String getAwayTeam() {
        return this.awayTeam;
    }

    public int getHomePts() {
        return this.homePts;
    }

    public int getAwayPts() {
        return this.awayPts;
    }

    public int playGame() {
        return this.gamesPlayed += 1;
    }

    public int setWins() {
        return this.wins += 1;
    }

    public int getWins() {
        return this.wins;
    }

    public int setLoss() {
        return this.loss += 1;
    }

    public int getLoss() {
        return this.loss;
    }
}
