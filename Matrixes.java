import java.util.Scanner;
public class Matrixes {
    public static void main(String [] args){
        int row1,row2,col1,col2;
        int [][]Arr1;
        int [][]Arr2;
        Matrix m=new Matrix();
        System.out.println("Enter no of rows for matrix 1: ");
        row1=m.rows();
        System.out.println("Enter no of columns for matrix 1: ");
        col1=m.columns();
        System.out.println("Enter no of rows for matrix 2: ");
        row2=m.rows();
        System.out.println("Enter no of columns for matrix 2: ");
        col2=m.columns();
        Arr1=m.setmatix(row1,col1);
        Arr2=m.setmatix(row2,col2);
        System.out.println("Sum of two matrixes: ");
        m.add(Arr1,Arr2,row1,col1,row2,col2);
        System.out.println("Product of two matrixes: ");
        m.product(Arr1,Arr2,row1,col1,row2,col2);
    }
}