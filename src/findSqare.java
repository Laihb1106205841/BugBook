import java.util.Scanner;

public class findSqare {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int chang =scan.nextInt();
        int kuan  =scan.nextInt();
        int[][] Zhen =new int[chang][kuan];
     //   boolean[][]zhen =new boolean[chang][kuan];
       for(int i=0;i<chang;i++){
           for(int j=0;j<kuan;j++){
               Zhen[i][j]=scan.nextInt();
           //    if(Zhen[i][j]==1) zhen[i][j]=true;
           }
       }
       int []arr =new int[5];
       arr= new int[]{8, 1, 4, 3, 5};
        InsertSort(arr);



        int fin =FindAllOneSquare(Zhen);
        System.out.println(fin);



    }
    public static int FindAllOneSquare(int [][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int dp[][] = new int[m][n];
        for (int i = 0; i < m; i++){
            dp[i][0] = matrix[i][0];
        }
        for (int j = 0; j < n;j++){
            dp[0][j] = matrix[0][j];
        }
        for (int i=1; i < m; i++){
            for (int j = 1; j < n; j++){
                if (matrix[i][j] == 0)
                    dp[i][j] = 0;
                else {
                    dp[i][j] = Math.min(dp[i-1][j-1],
                            Math.min(dp[i][j-1], dp[i-1][j])) + 1;
                }
            }
        }
        int max = 0;
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (dp[i][j] > max)
                    max = dp[i][j];
            }
        }
        return max;
    }
    void InsertSort(int arr[], int len){
        // 检查数据合法性
        if(arr == null || len <= 0){
            return;
        }
        for(int i = 1; i < len; i++){
            int tmp = arr[i];
            int j;
            for(j = i-1; j >= 0; j--){
                //如果比tmp大把值往后移动一位
                if(arr[j] > tmp){
                    arr[j+1] = arr[j];
                }
                else{
                    break;
                }
            }
            arr[j+1] = tmp;
        }
    }
  public static void  InsertSort(int arr[]){
        // 检查数据合法性
        if(arr == null ){
            return;
        }
        for(int i = 1; i < arr.length; i++){
            int tmp = arr[i];
            int j;
            for(j = i-1; j >= 0; j--){
                //如果比tmp大把值往后移动一位
                if(arr[j] > tmp){
                    arr[j+1] = arr[j];
                }
                else{
                    break;
                }
            }
            arr[j+1] = tmp;
        }
    }
}
