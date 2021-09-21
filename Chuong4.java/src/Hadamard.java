import java.util.Objects;

public class Hadamard {
    public static void main(String[] args) {
        int n =Integer.parseInt(args[0]);
        int [][] a= new int[n][n];
        a[0][0]=1;
        for(int x=1;x<n;x+=x){
            for(int i=0;i<x;i++){
                for(int j=0;j<x;j++){
                    a[i+x][j]=a[i][j];
                    a[i][j+x]=a[i][j];
                    if(a[i][j]==1) a[i+x][j+x]=0;
                    else a[i+x][j+x]=1;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]==1) System.out.print("T ");
                else System.out.print("O ");
            }
            System.out.println();
        }
    }
}
