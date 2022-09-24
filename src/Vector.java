import java.util.ArrayList;
public class Vector {
    ArrayList<Integer> coordList = new ArrayList<Integer>();
    Vector(int coord1, int coord2, int coord3){

        this.coordList.add(coord1);
        this.coordList.add(coord2);
        this.coordList.add(coord3);

    }
    public double vectorLength() {
        double res = Math.sqrt(Math.pow(this.coordList.get(0), 2)
                +Math.pow(this.coordList.get(1), 2)
                +Math.pow(this.coordList.get(2), 2));
        return res;
    }
    public double vectorScal(Vector second_vector) {
        double res = this.coordList.get(0)*second_vector.coordList.get(0)
                +this.coordList.get(1)*second_vector.coordList.get(1)
                +this.coordList.get(2)*second_vector.coordList.get(2);
        return res;
    }

    public ArrayList<Integer> vectorProd(Vector second_vector){
        ArrayList<Integer> new_coordList = new ArrayList<Integer>();

        new_coordList.add(this.coordList.get(1)*second_vector.coordList.get(2)
                -second_vector.coordList.get(1)*this.coordList.get(2));
        new_coordList.add(this.coordList.get(2)*second_vector.coordList.get(0)
                -second_vector.coordList.get(2)*this.coordList.get(0));
        new_coordList.add(this.coordList.get(0)*second_vector.coordList.get(1)
                -second_vector.coordList.get(0)*this.coordList.get(1));
        return new_coordList;
    }

    public double vectorCos(Vector second_vector) {
        double res = vectorScal(second_vector) / (vectorLength() * second_vector.vectorLength());
        return res;
    }
    public ArrayList<Integer> vectorOpers(Vector second_vector, char oper) {
        ArrayList<Integer> new_coordList = new ArrayList<Integer>();

        for (int i = 0; i<3; i++) {
            if (oper == '+') {
                new_coordList.add(this.coordList.get(i) + second_vector.coordList.get(i));
            }
            else{
                new_coordList.add(this.coordList.get(i) - second_vector.coordList.get(i));
            }
        }

        return new_coordList;
    }
    public static int[][] vectorGen(int n){
        int[][] mas_vector = new int[n][3];
        for(int i =0; i < n; i++){
            for(int z =0; z < 3; z++) {
                mas_vector[i][z] = (int) (Math.random() * (100 + 1));
            }
        }
        return mas_vector;
    }
}
