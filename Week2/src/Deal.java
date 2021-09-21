public class Deal {
    public static void main(String[] args) {
        int M = Integer.parseInt(args[0]);
        String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades" };
        String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "Jack", "Queen", "King", "Ace" };

        // avoid hardwired constants
        int SUITS = suit.length;
        int RANKS = rank.length;
        int N = SUITS * RANKS;

        // initialize deck
        String[] deck = new String[N];
        for (int i = 0; i < RANKS; i++) {
            for (int j = 0; j < SUITS; j++) {
                deck[SUITS*i + j] = rank[i] + " of " + suit[j];
            }
        }
        for(int i=0; i<M; i++)
        {
            for(int j =0; j<5; j++)
            {
                int k = (int) (Math.random()*N);
                System.out.println( deck[k] );
            }
            System.out.println("-------------------------");
        }
    }
}
