
public class HomeWork4 {

    public static void main(String[] args) {
        System.out.println("Direct order:");
        DirectOrder.result1();

        System.out.println("\nReverse order:");
        ReverseOrder.result2();
    }

    public static class ReverseOrder {
        private static final int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        public static void result2() {
            for (int i = 1; i <= 9; i++) {
                for (int j : number) {
                    System.out.print(j + "x" + i + "=" + j * i + "  ");
                }
                System.out.println();
            }
        }
    }
}


