package by.itacademy.lessen13.bazhenava;

public class Task3 {

    //Составить программу для вычисления результат по формуле. В качестве
    //входных параметров задать x = 0.5; n = 20;

    public static void main(String[] args) {
        double x = 0.5;
        int n = 20;
        double result = calculate(x, n);
        System.out.printf("Результат: %.6f%n", result);
    }

    public static double calculate(double x, int n) {
        double sum = 0.0;
        for (int k = 1; k <= n; k++) {
            sum += (Math.sin(k * x / 2) + Math.sin((k * x - 1) / 2)) / Math.pow(Math.E, x - 1 / k);
        }
        sum = sum * Math.sqrt(n * Math.PI);
        return sum;
    }
}
