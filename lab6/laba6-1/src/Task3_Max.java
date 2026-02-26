public class Task3_Max {

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static double max(double a, double b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {

        System.out.println(max(5, 9));
        System.out.println(max(3.5, 7.2));
    }
}