public class Calendarr {
    public static void main(String[] args) {
        int m =Integer.parseInt(args[0]);
        int y =Integer.parseInt(args[1]);
        int l=0, c=0;
        if(m==2)
        if( (y%400 == 0) || (y%40 == 0 && y%100 != 0) ) l=1;
        String[] k={ "January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October","November", "December"  };
        System.out.println("         "+k[m-1]+ " "+ y);
        System.out.println("  Su   M  Tu   W  Th   F  Sa");

        int d=1;
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31*m0)/ 12) % 7;

        for(int i=1; i<=d0; i++)
            System.out.print("    ");

        if(l==1) c=29;
        else if(m==2 && l==0) c=28;
        else if( m==4 || m==6 || m==9 || m==11 ) c=30;
        else c=31;
        int i=1;

        for(i=1; i<=7-d0; i++ )
            System.out.print("   "+i);
        System.out.println();

        while(i<=c) {
            for (int j = i; j <= i + 6; j++) {
                if(j<=c) {
                    if (j >= 10)
                        System.out.print("  " + j);
                    else System.out.print("   " + j);
                }
                else break;

            }
            System.out.println();
            i=i+7;
        }


    }
}
