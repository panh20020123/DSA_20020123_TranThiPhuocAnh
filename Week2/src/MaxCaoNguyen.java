public class MaxCaoNguyen {
    public static void main(String[] args) {
        int[] b = {1, 1, 3, 7, 5, 6, 6, 1, 1, 1, 1, 1, 1, 5, 34, 6, 6, 6, 7, 4, 4, 4, 4, 4, 4, 4, 4, 4};
        int n = b.length;
        int[] a= new int[n+2];
        a[0]=-999;
        a[n+1]= -999;
        for(int k=1; k<=n; k++)
        {
            a[k]=b[k-1];
        }
        int kq=0;

        for (int j = 1; j <=n; j++) {
            if (a[j] < a[j - 1]) {
                int d=0, s=0;
                for (int t = j+1; t <=n+1; t++)
                {
                    if(a[t]>a[t-1] ) {d=1;break;}
                    else if(a[t]<a[t-1]) break;
                    else s++;
                }
                if(d==1 && s==0) kq=Math.max(kq, 1);
                else if(d==1 && s!=0) kq=Math.max(kq, s+1);
            }
        }
        System.out.println(kq);
    }
}
