import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Student{
    private int token;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.token = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getToken() {
        return token;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if(s1.getCgpa() < s2.getCgpa()) return 1;
        if(s1.getCgpa() > s2.getCgpa()) return -1;

        int strCompare = s1.getFname().compareTo(s2.getFname());
        if(strCompare != 0) return strCompare;

        if(s1.getToken() < s2.getToken()) { return -1; }
        else  { return -1; }
    }
}

public class JavaPriorityQueue {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalEvents = Integer.parseInt(in.nextLine());
        PriorityQueue<Student> queue = new PriorityQueue<Student>(totalEvents, new StudentComparator());
        while(totalEvents>0){
            String event = in.nextLine();
            //Complete your code
            if(!event.equals("SERVED")) {
                String[] parts = event.split(" ");
                Student st = new Student(Integer.parseInt(parts[3]), parts[1], Double.parseDouble(parts[2]));
                queue.add(st);
            } else {
                queue.poll();
            }
            totalEvents--;
        }

        if(queue.size() == 0) {
            System.out.println("EMPTY");
        } else {
            while(queue.size() > 0) {
                System.out.println(queue.poll().getFname());
            }
        }
    }
}