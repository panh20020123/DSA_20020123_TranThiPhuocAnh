public class Dragon {
    public static void main(String[] args) {
        String a="F";
        System.out.println(a);
        for(int i=1; i<=5; i++)
        {
            String b= a+"L"+a;
            System.out.println(b);
            a=b;
        }
    }
}
