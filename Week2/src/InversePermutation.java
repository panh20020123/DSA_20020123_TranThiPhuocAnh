public class InversePermutation {
    public static void main(String[] args) {
        String s= args[0];
        int n = s.length();
        int[] a = new int[n];
        for(int i=0; i<n; i++)
        {
            a[i]=Integer.parseInt( s.substring(i, i+1) );
        }
        int[] b =new int[n];
        for(int i=0; i<n; i++)
        {
            b[a[i]]=i;
        }
        for (int i=0; i<n; i++)
            System.out.print(b[i]);
    }
}
