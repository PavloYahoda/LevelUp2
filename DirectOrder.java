
public class DirectOrder {

    private static final int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static void result1() {
        for (int i = 1; i <= 9; i++) {
            for (int j : number) {
                System.out.print(j + "x" + i + "=" + j * i + "  ");
            }
            System.out.println();
        }
    }
}
