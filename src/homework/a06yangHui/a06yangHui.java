package homework.a06yangHui;

public class a06yangHui {
    public static void main(String[] args) {
        int n = 6;
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
                }
            }
        }
        //二维数组求
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        // 使用组合公式来计算杨辉三角
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(gongshi(i, j) + " ");
            }
            System.out.println();
        }
    }
        public static int gongshi(int n,int m){

            return jiecheng(n)/(jiecheng(m)*jiecheng((n-m)));

        }
        public static int jiecheng(int num) {
            if (num == 0 || num == 1) {
                return 1;
            }
            int result = 1;
            for (int i = 2; i <= num; i++) {
                result *= i;
            }
            return result;
        }
    }
