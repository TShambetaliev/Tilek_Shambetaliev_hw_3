import java.util.Arrays;
public class Main {
    public static void bubbleSort(double[] sortArr){
        for (int i = 0; i < sortArr.length - 1; i++) {
            for(int j = 0; j < sortArr.length - i - 1; j++) {
                if(sortArr[j + 1] < sortArr[j]) {
                    double swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }
            }
        }
    }
    public static void main(String[] args) {
        double[] numbers = {1.5, -3, 5, 7, 8, 11, 13, 6, 20, 13, 95, 63, 4, 5.5, 15};
        System.out.println(Arrays.toString(numbers));
        double sum = 0.0;
        int kol = 0;
        boolean ech = false;
        for (double elem : numbers) {
            if (elem < 0) {
                ech = true;
            } else if (elem > 0 && ech) {
                sum = sum + elem;
                kol++;
                System.out.println(elem);
            }
        }
        System.out.println("среднее арифметическое число равен" + sum / kol);
        System.out.println("-----------" );
        double[] sortArr = {1.5, -3, 5, 7, 8, 11, 13, 6, 20, 13, 95, 63, 4, 5.5, 15};
        bubbleSort(sortArr);
        for(int i = 0; i < sortArr.length; i++){
            System.out.print(sortArr[i] + "\n");
        }
    }
    }
