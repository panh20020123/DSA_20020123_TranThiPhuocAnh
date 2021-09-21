import java.util.Random;

public class Exercise {
    public static void main(String[] args) {
/*

        double xx = 37.39839;
        double x = Math.sin(xx), y = Math.cos(xx);
        System.out.println(x*x + y*y);

        boolean t= true, f= false;
        boolean i = (!(t && f) && (t || f)) || ((t && f) || !(t || f));//
        System.out.println(i);

        double a=3.14159;
        System.out.println(a);
        System.out.println(a + 1);
        System.out.println(8 / (int) a);
        System.out.println(8 / a);
        System.out.println((int) (8 / a));

        System.out.println((Math.sqrt(2) * Math.sqrt(2) == 2));

        double x1=3.5, y1=5.3;
        System.out.printf("%.3f",Math.sqrt(x1*x1+y1*y1));
        System.out.println(" ");

        double random1 =Math.random();
        random1 = random1*2 + 3;
        System.out.println( (int) random1 );


        int ngay = 16, thang = 5;
        System.out.println( ((thang == 4)|| (thang ==5)) || ( (thang==3 && ngay >=20) || (thang ==6 && ngay <=20) ) );

        double P=40000680, r=6.8;
        int t=2;
        int t1=t*12;
        double r1= r/12/100;
        System.out.println( (r1*P)/(1- Math.pow(1+r1, -t1)) );

        //CartesianToPolar.java
        double x=3.5, y=4.5;
        System.out.println( Math.atan2(y, x) +" ;"+ Math.sqrt(x*x+y*y) );

        //StdGaussian.java
        double u = Math.random(), v= Math.random();
        u = u*1+0;
        v = v*1+0;
        System.out.println( (Math.sin(2*Math.PI*v))*Math.sqrt(-2*(Math.log(v))) );
*/
        //RGBtoCMYK.java
        double red = 156, green = 37, blue = 217;
        double white =Math.max( red/255, Math.max( green/255, blue/255 ) );
        double cyan = (white - red / 255) / white;
        double magenta = (white - green / 255) / white;
        double yellow = (white - blue / 255) / white;
        double black = 1 - white;
        System.out.println();

    }
}
