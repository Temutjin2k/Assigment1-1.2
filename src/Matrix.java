import java.util.Scanner;

class Matrix{
    double[][] matrix;
    int rows, coll;
    public Matrix(int rows, int coll){
        matrix = new double[rows][coll];
        this.rows = rows;
        this.coll = coll;
    }

    public void setValue(int row, int coll, double value){
        matrix[row][coll] = value;
    }

    public void addition(Matrix otherMatrix){
        if(otherMatrix.matrix.length != rows || otherMatrix.matrix[0].length != coll){
            System.out.println("Matrices have different sizes");
        }

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < coll; j++){
                System.out.print(matrix[i][j] + otherMatrix.matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public void multiplication(double num){
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < coll; j++){
                System.out.print(matrix[i][j] * num + " ");
            }
            System.out.println();
        }
    }


    public void print(){
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < coll; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        Matrix a = new Matrix(2, 2);
        a.setValue(0, 0, 5);
        a.setValue(0, 1, 2);
        a.setValue(1, 0, 0);
        a.setValue(1, 1, 6);


        a.print();

        Matrix b = new Matrix(2, 2);
        b.setValue(0, 0, 2);
        b.setValue(0, 1, 6);
        b.setValue(1, 0, 13);
        b.setValue(1, 1, 4);
        b.print();

        System.out.println("Result of addiction: ");
        a.addition(b);

        System.out.println("Enter a number for multiplicaton: ");
        double num = scan.nextDouble();
        System.out.println("Result of Mulltiplication of Matrix a: ");
        a.multiplication(num);

    }
}
