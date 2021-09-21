public class Birthday {
    public static void main(String[] args) {
        //0 - 364
        int kq=0;
        for(int i=0; i<1000; i++)
        {
            int s=0;
            int[] a= new int[364];
            while(true)
            {
                int x=(int) (Math.random()*364);
                if(a[x]==0) {a[x]=1; s++;}
                else break;
            }
            kq += s;
        }
        System.out.println(kq/1000);
    }
}
