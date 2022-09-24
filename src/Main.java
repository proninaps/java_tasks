import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


//        Matrix b = new Matrix(2, 2);
//        Matrix c = new Matrix(2,2);

//        for (int i = 0; i < b.matrix.length; i++) {
//            for (int j = 0; j < b.matrix[0].length; j++) {
//                System.out.format("%6d ", b.matrix[i][j]);
//            }
//            System.out.println();
//        }


//        int[][] result = b.matrixDegree(2);


//        for (int i = 0; i < result.length; i++) {
//            for (int j = 0; j < result[0].length; j++) {
//                System.out.format("%6d ", result[i][j]);
//            }
//        System.out.println();
//        }

        Vector a = new Vector(1, 2, 3);
        Vector b = new Vector(2, 5, 6);
//        System.out.println(a.coordList.toString());
//        ArrayList<Integer> result = a.vectorOpers(b, '+');
//        System.out.println(result.toString());
//        double result = a.vectorScal(b);
//        double result = a.vectorLength();
//        ArrayList<Integer> result = a.vectorProd(b);
//        System.out.println(result.toString());
//        int[][] result = Vector.vectorGen(5);
//        for (int i = 0; i < result.length; i++) {
//            for (int j = 0; j < result[0].length; j++) {
//                System.out.format("%6d ", result[i][j]);
//            }
//        System.out.println();
//        }
        double res =a.vectorCos(b);
        System.out.print(res);
    }



}