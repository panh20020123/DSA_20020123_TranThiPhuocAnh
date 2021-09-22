public class Week4 {
    /**
     * So lon hon.
     * @return max of $a and $b
     */
    public static int max2Int(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    /**
     * So nho nhat trong mang.
     * @return min of array $arr
     */
    public static int minArray(int[] arr) {
        int s = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < s) {
                s = arr[i];
            }
        }
        return s;
    }

    /**
     * Tinh BMI.
     * weight kg.
     * height m
     * @return BMI index
     */
    public static String calculateBMI(double weight, double height) {
        double k = weight / Math.pow(height, 2.0);
        double x = (double) Math.round(k * 10) / 10;
        if (x < 18.5) {
            return "Thiếu cân";
        }
        if (x >= 18.5 && x <= 22.9) {
            return "Bình thường";
        }
        if (x >= 23 && x <= 24.9) {
            return "Thừa cân";
        }
        return "Béo phì";
    }
}