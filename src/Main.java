import java.util.Arrays;

public class Main {
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
        double[] number = {1.5, -3, 5, 7, 8, 11, 13, 6, 20, 13, 95, 63, 4, 5.5, 15};

        boolean sort = false;
        while (!sort) {
            sort = true;
            for (int i = 0; i < number.length; i++) {
                if (number[i] < number[i - 1]) {
                    double temp = number[i];
                    number[i - 1] = temp;
                    sort = false;
                }
            }
            System.out.println(number);
        }
    }
}
