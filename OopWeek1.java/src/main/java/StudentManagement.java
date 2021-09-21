import java.util.Arrays;
import java.util.Objects;

public class StudentManagement {
    static int k = 0 ;
    static Student[] students= new Student[105];

    public static void main(String[] args) {

     /*
        Nguyen Van An - 17020001 - K62CC - 17020001@vnu.edu.vn
        Nguyen Van B - 17020002 - K62CC - 17020002@vnu.edu.vn

        Nguyen Van C - 17020003 - K62CB - 17020003@vnu.edu.vn
        Nguyen Van D - 17020004 - K62CB - 17020004@vnu.edu.vn*/

        Student a=new Student("Nguyen Van A", "17020001", "mail.com");
        Student b = new Student( "anh2", "17030002", "mail2.com" );
        Student x= new Student();

        System.out.println(sameGroup(a, b));
        addStudent(a);
        addStudent(b);
        addStudent(x);
        System.out.println(studentsByGroup());
        removeStudent("10002");
        System.out.println(studentsByGroup());


    }
    public static boolean sameGroup( Student s1, Student s2 )
    {
        if( Objects.equals(s1.getGroup(), s2.getGroup())) return true;
        return false;
    }
    public static void addStudent(Student newStudent)
    {
        k++;
        students[k] = newStudent;
    }
    public static String studentsByGroup()
    {
        int[] a =new int[105];
        Arrays.fill(a, 0);
        String s= null;

        for(int i=1; i<=k; i++)
        {
            if( a[i]==0 )
            {
                String st=students[i].getGroup();
                s = st + "\n" + students[i].getInfo() + "\n";
                for(int j=i+1; j<=k; j++)
                {
                    if(Objects.equals(students[j].getGroup(), st) && a[j]==0 )
                    {
                        s = s + students[j].getInfo() + "\n";
                        a[j] = 1;
                    }
                }
                a[i]=1;
            }
        }
        return s;
    }

    public static void removeStudent(String id)
    {
        for(int i=1; i<=k; i++)
        {
            if(Objects.equals(students[i].getId(), id))
            {
                System.arraycopy(students, i + 1, students, i, k - i);
                break;
            }
        }
        k=k-1;
    }

}
