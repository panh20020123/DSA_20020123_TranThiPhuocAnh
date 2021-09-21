package MyVector;

public class MyVector {
    public int x;
    public int y;
    public MyVector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public MyVector add(MyVector other) {
        return new MyVector(other.x + x, other.y+y);
    }

  /*  public void printVector() {
        System.out.println("("+x +" ," + y + ")");
    }*/
    public String toString()
    {
        return "("+x +" ," + y + ")";
    }
}
