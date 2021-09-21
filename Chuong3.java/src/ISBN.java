public class ISBN {
    public static void main(String[] args) {
       String s = args[0];

        int x=0;

        for(int i=0; i<9; i++)
        {
            //System.out.println(s.substring(i, i+1));
            x += Integer.parseInt( s.substring(i, i+1));
        }
        for(int i=0; i<=9; i++)
            if( (i+x)%11==0 ) System.out.println(i+s);
    }
}
