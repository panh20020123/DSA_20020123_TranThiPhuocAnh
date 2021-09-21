import MyVector.MyVector;

public class Helloworld {

    public static void main(String[] args) {
        for (int i=0; i<10; i++) {
            System.out.println("Hello World, "+args[0]+"," +args[1]+ " and " +args[2]);
        }

        System.out.println("**        ***    **********      **             *             **");
        System.out.println("**      ***      **        **     **           ***           ** ");
        System.out.println("**    ***        **         **     **         ** **         **  ");
        System.out.println("**  ***          **          **     **       **   **       **   ");
        System.out.println("*****            **          **      **     **     **     **    ");
        System.out.println("**  ***          **          **       **   **       **   **     ");
        System.out.println("**    ***        **         **         ** **         ** **      ");
        System.out.println("**      ***      **        **           ***           ***       ");
        System.out.println("**        ***    **********              *             *        ");

        MyVector v1 = new MyVector(2, 4);
        MyVector v2 = new MyVector(3, -5);
        MyVector v = v1.add(v2);
        System.out.println(v);
    }

}
