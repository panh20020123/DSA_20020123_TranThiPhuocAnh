public class RelativelyPrim {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        UOC m= new UOC();
        for(int i=1; i<=n; i++) {
            for (int j = 1; j <= n; j++)
                if (m.uoc(i, j) == 1) System.out.print(" * " );
                else System.out.print("   " );
            System.out.println();
        }
    }
}
