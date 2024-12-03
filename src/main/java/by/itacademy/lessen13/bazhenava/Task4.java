package by.itacademy.lessen13.bazhenava;

public class Task4 {

    //Задается n точек на плоскости. Записать логическое выражение, соответствующее заданной области истинности.
    // Подсчитать количество точек, попавших в заданную область.

    public static void main(String[] args) {
        // придуманные точечки
        double[][] nPoints = { {-2.5, 0.0}, {3.5, 1.5}, {2.5, 1.0}, {1.0, -1.5}, {0.0, 1.0}, {0.5, 0.0}, {-2.0, -1.0} };
        int count = countPointsInArea(nPoints);
        System.out.println("Количество точек в области: " + count);
    }
    public static int countPointsInArea(double[][] points) {
        int count = 0;
        for (double[] point : points) {
            double x = point[0];
            double y = point[1];
            if (isInArea(x, y)) {
                count++;
            }
        }
        return count;
    }
    public static boolean isInArea(double x, double y) {
        return (x >= -2 && x <= 2) && (y >= -1 && y <= 2);
    }
}
