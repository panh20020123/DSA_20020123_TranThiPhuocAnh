public class DayOfWeek {
    public static void main(String[] args) {
        int d=23, m =12, y =2009;
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31*m0)/ 12) % 7;
        String[] k={ "CN", "T2", "T3", "T4", "T5", "T6", "T7" };
        System.out.println(k[d0]);

    }
}
