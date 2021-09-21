public class Gambler {
    public static void main(String[] args) {
        int stake = Integer.parseInt(args[0]); // gambler 's statin bankroll
        int goal = Integer.parseInt(args[1]); // gambler 's desiredbankroll
        int T = Integer.parseInt(args[2]); // number of trialsto perform

        int bets = 0; // total number of bets made
        int wins = 0; // total number of games won

        // repeat T times
        for (int t = 0; t < T; t++) {
            // do one gambler 's ruin simulation
            int cash = stake;
            while (cash > 0 && cash < goal) {
                bets++;
                if (Math.random() < 0.5) cash++; // win $1
                else cash --; // lose $1
                }
            if (cash == goal) wins++; // did gambler goachieve desired goal?
        }
        // print results
        System.out.println(wins + " wins of " + T);
        System.out.println("Percent of games won = " + 100.0 * wins / T);
        System.out.println("Avg # bets = " + 1.0 * bets / T);
        }

}
