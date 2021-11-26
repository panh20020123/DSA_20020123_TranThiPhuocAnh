import java.util.Comparator;
import java.util.TreeSet;

public class testCompare {
    static class Student implements Comparable{
        private String name;
        private int tuoi;

        public Student(String name, int tuoi) {
            this.name = name;
            this.tuoi = tuoi;
        }

        @Override
        public int compareTo(Object o) {
            Student o2 = (Student) o;
            if (this.tuoi > o2.tuoi) return 1;
                else if (this.tuoi < o2.tuoi) return -1;
                return this.name.compareTo(o2.name);
        }
    }

    public static void main(String[] args) {
//        TreeSet<Student> tree = new TreeSet<>(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                if (o1.tuoi > o2.tuoi) return 1;
//                else if (o1.tuoi < o2.tuoi) return -1;
//                return o1.name.compareTo(o2.name);
//            }
//        });

        TreeSet<Student> tree = new TreeSet<>();

        Student a = new Student("An", 23);
        Student b = new Student("Anh", 67);
        Student c = new Student("Anhh", 55);

    //    System.out.println(c == b);
        tree.add(c);
        tree.add(b);
        tree.add(a);
//
//        for(Student i : tree) {
//            System.out.println(i.name);
//        }

        Student x = new Student("B", 24);
        System.out.println(tree.higher(x).name);

    }

}
