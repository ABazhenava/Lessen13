package by.itacademy.lessen13.bazhenava;

public class Task1 {
    //Написать приведенную формулу по правилам языка программирования.
    //Проверка, при x = 0.5 результат 2.45833

    public static void main(String[] args) {
        double result;
        double x = 0.5;

        result = Math.sqrt(Math.pow(Math.E, 2.2 * x)) - Math.abs(Math.sin((Math.PI * x) / (x + 2d / 3))) + 1.7;

        System.out.println(result);
    }
}
