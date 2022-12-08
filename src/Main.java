import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] numbers = new double[15];
        for (int i = 0; i < numbers.length; i += 1.5) {
            numbers[i] = i + (-4.5);}

            System.out.println(Arrays.toString(numbers));
            double sum = 0.0;
            int mass = 0;

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] < 0) {
                    for (int j = i + 1; j < numbers.length; j++) {
                        if (numbers[j] > 0) {
                            sum = sum + numbers[j];

                            mass++;
                        }
                    }
                    break;
                }
            }
            System.out.println("sum"+sum);
            System.out.println("kolichestvo"+mass);
            System.out.println("sum/kolichestvo"+sum/mass);
        }
    }