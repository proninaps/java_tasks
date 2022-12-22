//Найдите корень уравнения cos⁡(x^5 )+ x^4-345.3*x-23=0 на отрезке [0;10]
//        с точностью по x не хуже 0.001. Известно, что на этом промежутке
//        корень единственный. Используйте для этого метод деления отрезка пополам (и рекурсию).
// Math.cos(Math.pow(x, 5)) + Math.pow(x, 4) - 345.3 * x - 23;
public class Main {
    public static void main(String[] args) {
        System.out.println(check_the_root(1, 10));
    }
    public static double solve_the_equation(double x) {
        return Math.cos(Math.pow(x, 5)) + Math.pow(x, 4) - 345.3 * x - 23;
    }
    public static double check_the_root(double seg_start, double seg_end){
        if (seg_end-seg_start <= 0.001){
            return seg_start;
        }
        double mid = seg_start + (seg_end - seg_start)/2;
        if (solve_the_equation(seg_start)<0 && solve_the_equation(mid)>0 || solve_the_equation(seg_start)>0 && solve_the_equation(mid)<0){
            return check_the_root(seg_start, mid);
        }
        else{
            return check_the_root(mid, seg_end);
        }
    }

}