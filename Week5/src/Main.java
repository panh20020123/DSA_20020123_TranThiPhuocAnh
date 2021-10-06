import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

/*    public static void testlist(Slit l) {
        l.print();
        l.addLast("One");
        l.print();
        l.addLast("Two");
        l.print();
        l.addLast("Three");
        l.print();
    }
    public static void testlist(Dlist l) {
        l.print();
        l.addLast("One");
        l.print();
        l.addFirst("Two");
        l.print();
        l.addLast("Three");
        l.print();
    }*/

    public static void testlist(Mylist<String> l) {
        l.print();
        l.addLast("One");
        l.print();
        l.addLast("Two");
        l.print();
        l.addFirst("Three");
        l.print();
    }

    public static void main(String[] args) {
        System.out.println("Test Slist ");
        Slit<String> l1 = new Slit<>();
        testlist(l1);

        System.out.println("Test Dlist ");
        Dlist<String> l = new Dlist<>();
        testlist(l);

        System.out.println("Test Dlist ");
        Dlist<Integer> l2 = new Dlist<>();
        testInterger(l2);



//        List<String> studentnames = new ArrayList<>();
//        List<String> stu = new LinkedList<>();
    }

    private static void testInterger(Dlist<Integer> l) {
        l.print();
        l.addLast(1);
        l.print();
        l.addLast(2);
        l.print();
        l.addFirst(2);
        l.print();
    }
}
