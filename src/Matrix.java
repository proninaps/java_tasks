
public class Matrix{

    int[][] matrix;

    Matrix(int string_len, int column_len) {
        this.matrix = new int [string_len][column_len];
        for (int i = 0; i < string_len; i++) {
            for (int z = 0; z < column_len; z++) {
                int randomNumber = (int) (Math.random()*(100+1));
                matrix[i][z] = randomNumber;
            }
        }
    }


    public int[][] matrixOperations(Matrix second_matrix, char oper){
        int[][] newMatrix = new int[this.matrix.length][this.matrix[0].length];
        for (int i = 0; i < this.matrix.length; i++) {
            for (int z = 0; z < this.matrix[i].length; z++) {
                if (oper == '+') {
                    newMatrix[i][z] = this.matrix[i][z] + second_matrix.matrix[i][z];
                } else {
                    newMatrix[i][z] = this.matrix[i][z] - second_matrix.matrix[i][z];
                }
            }
        }
        return newMatrix;

    }

    public int[][] matrixAndNumber(int num){
        int[][] newMatrix = new int[this.matrix.length][this.matrix[0].length];
        for (int i = 0; i < this.matrix.length; i++) {
            for (int z = 0; z < this.matrix[i].length; z++) {
                newMatrix[i][z] = this.matrix[i][z] * num;
            }
        }
        return newMatrix;
    }

    public int[][] matrixMult(Matrix second_matrix){

        int m = this.matrix.length;
        int n = second_matrix.matrix[0].length;
        int o = second_matrix.matrix.length;
        int[][] newMatrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int z = 0; z < n; z++) {
                for (int k = 0; k < o; k++) {
                    newMatrix[i][z] += this.matrix[i][k] * second_matrix.matrix[k][z];
                }
            }
        }

        return newMatrix;

    }

    public int[][] matrixTranspo(){
        int m = this.matrix[0].length;
        int n = this.matrix.length;
        int[][] newMatrix = new int[m][n];
        for (int i = 0; i < this.matrix.length; i++) {
            for (int z = 0; z < this.matrix[i].length; z++) {
                newMatrix[z][i] = this.matrix[i][z];
            }
        }
        return newMatrix;
    }



    public int[][] matrixDegree(int degree) {
        int[][] newMatrix = this.matrix;
        for (int i = 0; i < degree-1; i++ ) {
            newMatrix = this.matrixMult(this);
        }
        return newMatrix;
    }

}
