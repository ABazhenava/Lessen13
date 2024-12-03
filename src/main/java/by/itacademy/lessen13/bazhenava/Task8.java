package by.itacademy.lessen13.bazhenava;

public class Task8 {

    //Составить программу, вычисляющую значения функции до тех пор, пока не
    //будет пройден нуль функции. Значения аргумента x должны составлять
    //возрастающую арифметическую програссию с заданным начальным членом
    //0.1 и разностью 0.1. Для того, чтобы не произошло зацикливания, установить
    //предел изменения аргумента x = 10.

    public static void main(String[] args) {
        double Xнач = 0.1;
        double difference = 0.1; // разность
        double Xmax = 10.0; // предел изменения аргумента x
        double x = Xнач;

        System.out.printf("%-15s %-15s%n", "Значение x", "f(x)");
        while (x <= Xmax) {
            double fx = function(x);
            System.out.printf("%-15.6f %-15.6f%n", x, fx);
            if (fx == 0 || fx < 0) {
                break;
            }
            x += difference;
        }
    }

    public static double function(double x) {
        return (x * x - Math.pow(Math.E, 2 * x) + 4);
    }
}

