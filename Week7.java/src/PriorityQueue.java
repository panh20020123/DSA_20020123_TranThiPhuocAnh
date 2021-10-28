import java.util.*;

public class PriorityQueue {
    public List<Integer> que = new ArrayList<>();
    public List<Integer> quesup = new ArrayList<>();
    public int M;

    public void insert(int a) {    //  thêm một số vào hàng đợi
        que.add(a);
        quesup.add(a);
    }

    public int deleteMin() { // xóa số nhỏ nhất ra khỏi hàng đợi và trả về số đó.
        quesup.sort((o1,o2)->o2-o1);
        int s = quesup.get(0);
        que.remove(s);
        return s;
    }

    public static void main(String[] args) {
//        List<Integer> a = new ArrayList<>();
//        a.add(3);
//        a.add(0, 1);
//        System.out.println(a);
    }
}
