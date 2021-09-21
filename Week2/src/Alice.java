public class Alice {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double kq=0.0;
        int kq1=0;

        for(int i=0; i<50; i++)
        {
            int[] a=new int[n];
            int s=1;
            a[0]=1;
            while(true)
            {
                int x = (int)(Math.random()*n);
                if(a[x]==1) break;
                    else {a[x]=1; s++;}
            }
            if(s==n) kq++;
            kq1+=s;
        }
        System.out.println(kq/50.0);
        System.out.println(kq1/50);
    }
}
