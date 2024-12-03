package by.itacademy.lessen13.bazhenava;

public class Task6 {

    //Целочисленная функция f(K) = K3 - 25K2 +50K+1000 определена только для целых значений аргумента K.
    // Составить программу вычисления значений функции f(K) для 20 значений алгумента K в интервале (-30, 60)
    // с выводом лишь тех значений, которые удовлетворяют заданному условию, и подсчетом количества остальных ее значений.
    // В качестве начальных значений укажите A=3*103, B=6*104 , M=4.
    // Условие для определения выводимых значений f(K)

    public static void main(String[] args) {
        int n = 20;
        int Kmin = -30;
        int Kmax = 60;
        int A = 3 * 103;
        int B = 6 * 104;
        int M = 4;

        double T1 = Math.sqrt(A + B + M);
        double T2 = M * Math.sqrt(A + B);
        double T3 = Math.sqrt(A * B * M);
        double T4 = M * Math.sqrt(A * B);

        int step = (Kmax - Kmin) / (n - 1);
        int count = 0;
        System.out.printf("%-10s %-15s %-15s%n", "№", "Значение K", "f(K)");
        for (int i = 0; i < n; i++) {
            int K = Kmin + i * step;
            int fK = function(K);
            if ((fK >= T1 && fK <= T2) || (fK >= T3 && fK <= T4)) {
                System.out.printf("%-10d %-15d %-15d%n", (i + 1), K, fK);
            } else {
                count++;
            }
        }
        System.out.println("Количество значений, не попавших в указанные интервалы: " + count);
    }

    public static int function(int K) {
        return (K * K * K - 25 * K * K + 50 * K + 1000);
    }
}
