import java.util.*;

public class Randnum {
    int [] mas_weight;
    int[] mas_num;
    Randnum(int [] mas_weight, int [] mas_num) {
        this.mas_num = mas_num;
        this.mas_weight = mas_weight;
    }


    public int randGet(){
        int sum = 0;
        for (int i = 0; i < mas_weight.length; i++) { //перебираем массив с весами
         sum += mas_weight[i];   //Считаем сумму всех весов
        }
        int [] new_mas = new int[sum];//создаем новый массив размерностью суммы всех весов
        int index = 0;
        for(int i = 0; i<mas_num.length; i++) { //перебираем массив со значениями
            for (int z = 0; z < mas_weight[i]; z++) { //перебираем значения внутри массива с весами
                new_mas[index++] = mas_num[i];//присваеваем новому массиву значения массива со значениями, в котором числа посторяются массив с весами раз
            }
        }
        int rand_num = (int) (Math.random()*(new_mas.length)); //генерируем рандомное число в пределах длины массива
        rand_num = new_mas[rand_num]; // присваеваем значение по рандомному индексу
        return rand_num;
    }
}


