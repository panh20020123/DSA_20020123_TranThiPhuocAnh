public class SangNT {
        int n;
        public boolean b[]=new boolean[1000006];

        SangNT(int n){
            this.n=n;
        }

        public void Sang()
        {
            b[0]=false;
            b[1]=false;
            for(int i=2; i<=n; i++) b[i]=true;

            for(int i=2; i<=n; i++)
                if(b[i]==true)
                {
                    for(int t=2; t*i<=n; t++)
                        b[t*i]=false;
                }
        }

}
