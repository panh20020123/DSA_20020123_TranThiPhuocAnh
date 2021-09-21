public class ListenMusic {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);

        int t = (int)(Math.random()*n +1);
        double s=0.0;
        for(int i=1; i<m; i++)
        {
            int x = (int) (Math.random()*n+1);
            if(x == (t+1)) s += 1.0;
        }
        System.out.println(s/m);
    }
}
