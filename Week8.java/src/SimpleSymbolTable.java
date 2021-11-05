import java.util.ArrayList;
import java.util.List;

public class SimpleSymbolTable {
    List<Integer> Key;
    List<Integer> Value;

    public SimpleSymbolTable(){
        Key = new ArrayList<Integer>();
        Value = new ArrayList<Integer>();
    }

    public Integer getValue(int k) {
        for (int i = 0; i< Key.size(); i++)
            if (k == Key.get(i)) return Value.get(i);
        return null;
    }

    public boolean constainKey(int k) {
        for (int i = 0; i< Key.size(); i++)
            if (k == Key.get(i)) return true;
        return false;
    }

    public void insert(int k, int v) {
        Key.add(k);
        Value.add(v);
    }

    public void remove(int k) {
        for (int i = 0; i< Key.size(); i++)
            if (k == Key.get(i)) {
                Key.remove(i);
                Value.remove(i);
            }
    }

}
