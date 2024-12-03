package by.itacademy.lessen13.bazhenava;

public class Task5 {

    //Составить программу вычисления N значений функции Y для X, изменяющегося от X1 с шагом dX.
    // В качестве начальных значений выбрать A=1; X1=-2A; dX = A/5.

    public static void main(String[] args) {
        double A = 1;
        double X1 = -2 * A;
        double dX = A / 5;
        int N = 9; // Количество значений, которые нужно вычислить

        for (int i = 0; i < N; i++) {
            double X = X1 + i * dX;
            double Y = calculate(X);
            System.out.printf("X = %.2f, Y = %.2f%n", X, Y);
        }
    }

    public static double calculate(double X) {
        double A = 1;
        double result = 0;

        if (X <= 0) {
            result = A / 2 * (Math.pow(Math.E, X / A) + Math.pow(Math.E, -X / A));
        } else {
            result = 4 * Math.pow(A, 3) / (Math.pow(X, 2) + 4 * Math.pow(A, 2));
        }
        return result;
    }
}
