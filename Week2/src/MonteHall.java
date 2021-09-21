public class MonteHall {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double m=0, km=0;
        for(int i=0; i<n; i++)
        {
            double x= Math.random();
            double y= Math.random();
            x=x*2+1;
            y=y*2+1;
            if( (int) x == (int) y ) m++;
            else km++;
        }
        System.out.println("Xac suat khi ko doi la: "+ m/n*100.0 );
        System.out.println("Xac suat khi ko doi la: "+ km/n*100.0 );
    }
}
