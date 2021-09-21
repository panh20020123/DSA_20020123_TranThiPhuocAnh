public class UOC {
    public int uoc(int x, int y)
    {
        if(x>=y) {
            if(y==0) return x;
            return uoc(y, x%y);
        }
        else
        {
            if(x==0) return y;
            return uoc(x, y%x);
        }
    }

}
