public class ChuyenVi {
    public static void main(String[] args) {
        int[][] a = {
                {99, 85, 98},
                {98, 57, 78},
                {92, 77, 76},
                {94, 32, 11},
                {99, 34, 22},
                {90, 46, 54},
                {76, 59, 88},
                {92, 66, 89},
                {97, 71, 24},
                {89, 29, 38}
        };
        int[][] b = new int[3][10];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                b[i][j] = a[j][i];
                //System.out.print(b[i][j] + " ");
            }
        }
        //System.out.println();
/*
        int[][] a = {
                {99, 85, 98},
                {98, 57, 78},
                {92, 77, 76},
        };
        for(int i=0; i<3; i++)
            for(int j=0; j<3; j++)
            if(j<i)
            {
                int k = a[j][i];
                a[j][i]=a[i][j];
                a[i][j] = k;
                //System.out.println(a[i][j]+" " + a[j][i]+" " + k);
            }

       for(int i=0; i<3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
}*/
        double[][] weights = { {0.25, 0.25, 0.50} };
        double [][] c = new double[1][10];
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 3; k++) {
                    c[i][j] += weights[i][k] *((double) b[k][j]);
                }
                //c[i][j] /= 3.0;
            }
        }
        for(int i=0; i<1; i++)
           for(int j=0; j<10; j++) {
               System.out.printf("%.3f", c[i][j]);
               System.out.print("  ");
           }

    }
}
