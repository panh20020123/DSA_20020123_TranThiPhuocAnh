public class CouponCollector {
public static void main(String[] args) {
        int N = Integer.parseInt(args[0]); // number of card types
        boolean [] found = new boolean[N]; // found[i] = true if card i has been collected
        int cardcnt = 0; // total number of cards collected
        int valcnt = 0; // number of distinct cards

        // repeatedly choose a random card and check whether it's a new one
        while (valcnt < N) {
            int val = (int) (Math.random() * N); // random card between 0 and N-1
            cardcnt++; // we collected onemore card
            if (!found[val]) valcnt++; // it's a new card type
            found[val] = true; // update found[]
            }

        // print the total number of cards collected
        System.out.println(cardcnt);
        }
}