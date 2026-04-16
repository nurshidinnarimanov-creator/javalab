public class task1 {
    interface SumOperation {
        int operation(int a, int b);
    }

    public static void main(String[] args) {
        SumOperation sum = (a, b) -> a + b;
        System.out.println(sum.operation(5, 7));
    }
}