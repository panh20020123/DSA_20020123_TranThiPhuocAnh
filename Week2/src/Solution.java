// Import your library
// Do not change the name of the Solution class
public class Solution {
    /**
     * Phan so.
     * bao gom tu va mau int
     */
    int  numerator;
    int denominator;

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public void setNumerator(int k) {
        this.numerator = k;
    }

    /**
     * set mau.
     * @param k int
     */
    public void setDenominator(int k) {
        if (k != 0) {
            this.denominator = k;
        }
    }

    Solution ( int x, int y ) {
        if (y != 0) {
            this.numerator = x;
            this.denominator = y;
        } else {
            this.numerator = 0;
            this.denominator = 1;
        }
    }

    Solution ( ) {
        this.numerator = 0;
        this.denominator = 1;
    }

    /**
     * toi gian.
     * @return solution
     */
    public Solution reduce() {
        int xx = this.numerator;
        int yy = this.denominator;
        while ((xx * yy) != 0) {
            if (xx > yy) {
                xx %= yy;
            } else {
                yy %= xx;
            }
        }
        int k = xx + yy;
        this.numerator /= k;
        this.denominator /= k;
        return this;
    }

    /**
     * cong.
     * @param k
     * @return phan so
     */
    public Solution add(Solution k) {
        int m = numerator * k.getDenominator();
        int n = denominator * k.getNumerator();
        numerator = m + n;
        this.denominator *= k.getDenominator();
        return this;
    }

    /**
     * tru phan so.
     * @param k slo
     * @return slo
     */
    public Solution subtract(Solution k) {
        int m = numerator * k.getDenominator();
        int n = denominator * k.getNumerator();
        numerator = m - n;
        denominator *= k.getDenominator();
        return this;
    }

    /**
     * chia phan so.
     * @param k slu
     * @return slu
     */
    public Solution divide(Solution k) {
        if (k.getNumerator() != 0) {
            this.numerator *= k.getDenominator();
            this.denominator *= k.getNumerator();
        }
        return this;
    }

    /**
     * nhan phan so.
     * @param k slu
     * @return slu
     */
    public Solution multiply(Solution k) {
        numerator *= k.getNumerator();
        denominator *= k.getDenominator();
        return this;
    }

    /**
     * so sanh.
     * @param obj slu
     * @return slu
     */
    public boolean equals(Object obj) {
        if (obj instanceof Solution) {
            Solution other = (Solution) obj;
            int m = numerator * other.getDenominator();
            int n = denominator * other.getNumerator();
            if (m == n) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}