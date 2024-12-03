package by.itacademy.lessen13.bazhenava;

public class Task2 {

    //Составить программу вычисления значений функции f(x) из задачи 1 для n
    //значений аргумента x, равномерно распределенных на отрезке [a, b]. Для
    //проверки программы задать n = 10; a = 0.50; b = 1.00. Результаты выдать в виде
    //таблицы, в каждой строке порядковый номер, значение аргумента и значение
    //функции с шестью знаками после запятой.

    public static void main(String[] args) {
        int n = 10;
        double a = 0.50; // начало отрезка
        double b = 1.00; // конец отрезка

        // Вычисление шага между значениями x
        double step = (b - a) / (n - 1);

        // Шапочка
        System.out.printf("%-10s %-15s %-15s%n", "№ п/п", "Значение x", "f(x)");

        for (int i = 0; i < n; i++) {
            double x = a + i * step;
            double fx = function(x);

            System.out.printf("%-10d %-15.6f %-15.6f%n", (i + 1), x, fx);
        }
    }

    public static double function(double x) {
        return (Math.sqrt(Math.pow(Math.E, 2.2 * x)) - Math.abs(Math.sin((Math.PI * x) / (x + 2d / 3))) + 1.7);
    }
}
