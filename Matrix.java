import java.util.Scanner;

class Matrix {
    public int rows() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public int columns() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public int[][] setmatix(int row1, int col1) {
        int[][] Arr1 = new int[50][50];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                Arr1[i][j] = sc.nextInt();
            }
        }
        return Arr1;
    }

    public void add(int[][] Arr1, int[][] Arr2, int row1, int col1, int row2, int col2) {
        int[][] sum = new int[50][50];
        if ((row1 == row2) && (col1 == col2)) {
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    sum[i][j] = Arr1[i][j] + Arr2[i][j];
                }
            }
        } else {
            System.out.println("Cannot able to add the matrices!!");
        }
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

    public void product(int[][] Arr1, int[][] Arr2, int row1, int col1, int row2, int col2) {
        int[][] Ans = new int[50][50];
        if ((row1 == row2) && (col1 == col2)) {
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    for (int k = 0; k < row1; k++) {
                        Ans[i][j] = Ans[i][j] + (Arr1[i][k] * Arr2[k][j]);
                    }
                }
            }
        } else {
            System.out.println("Cannot able to add the matrices!!");
        }
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                System.out.print(Ans[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}