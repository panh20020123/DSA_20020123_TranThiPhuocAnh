import java.util.Scanner;
import java.util.TreeSet;

public class FindRunningMedianTreeSet {

    static class Inter implements Comparable{
        private double x;
        private int index;
        private Inter (double x, int index) {
            this.index = index;
            this.x = x;
        }
        public void setIndex(int i) {
            index = i;
        }
        public double getX()
        {
            return x;
        }

        @Override
        public int compareTo(Object o) {
            Inter o2 = (Inter) o;

            if(this.x > o2.x) return 1;
            else if(this.x < o2.x) return -1;
            return Integer.signum(this.index - o2.index);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        double a = in.nextDouble();
        System.out.println(String.format("%.1f", a));

        if(n == 1) return;

        Inter mid = new Inter(a, 1);
        double dmid = 0;
        int count = 1;

        TreeSet<Inter> treeSet = new TreeSet<Inter>();
        treeSet.add(mid);

        for (int i = 1; i < n; i++) {
            a = in.nextDouble();
            count++;
            Inter aa = new Inter(a, count);
 //           dmid = (aa.getX() + mid.getX())/2.0;
            if(treeSet.higher(aa) == mid) {
  //              System.out.println("abcxyz" + count);
                if((count % 2) != 0) {
                    mid = aa;
                    dmid = mid.getX();
    //                System.out.println("abcxyz");
                } else {
                    dmid = (aa.getX() + mid.getX())/2.0;
  //                  System.out.println("abcxyz" + count);
                }
            } else if (treeSet.lower(aa) == mid) {
            //    System.out.println("abcxyzz");
                if ((count % 2) != 0) {
                    dmid = mid.getX();
                } else {
                    dmid = (aa.getX() + mid.getX())/2.0;
                    mid = aa;

                }
            } else if (aa.compareTo(mid) == 1) {
             //   System.out.println("abcxyzzz");
                if (count % 2 != 0) {
                    dmid = mid.getX();
                } else {
                    Inter h = treeSet.higher(mid);
                    dmid = (mid.getX() + h.getX())/2.0;
                    mid = h;
                }
            } else if (aa.compareTo(mid) == -1) {
               // System.out.println("abcxyzzzz");
                if (count % 2 != 0) {
                    mid = treeSet.lower(mid);
                    dmid = mid.getX();
                } else {
                    dmid = (mid.getX() + treeSet.lower(mid).getX())/2.0;
                }
            }

            treeSet.add(aa);
            System.out.println(String.format("%.1f", dmid));

//            System.out.println(mid.getX());
//            for (Inter t : treeSet) {
//                System.out.print(t.getX() + "->");
//            }

//            System.out.println();
        }
    }
}
