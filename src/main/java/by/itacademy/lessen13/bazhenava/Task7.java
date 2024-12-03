package by.itacademy.lessen13.bazhenava;

public class Task7 {

    //Составить программу вычисления таблицы значений заданной функции для N значений X,
    // меняющихся от Xнач c заданных шагом HX, и M значений для Z, меняющихся от Zнач с шагом HZ.

    public static void main(String[] args) {
        int Xнач = 0;
        double HX = 0.5;   // шаг изменения X
        int N = 3;

        int Zнач = 1;
        double HZ = 0.7;   // шаг изменения Z
        int M = 2;         // количество значений Z

        for (int i = 0; i < N; i++) {
            double x = Xнач + i * HX;
            for (int j = 0; j < M; j++) {
                double z = Zнач + j * HZ;
                double result = calculate(x, z);
                System.out.printf("f(%.2f, %.2f) = %.4f%n", x, z, result);
            }
        }
    }

    public static double calculate(double x, double z) {
        return (Math.sqrt(Math.pow(z, 2) + Math.pow(x, 2)) * Math.log(z)
                + Math.abs(Math.log(z)) / Math.sqrt(Math.pow(x, 2)
                - Math.pow(z, 2) + 3.2));
    }
}

