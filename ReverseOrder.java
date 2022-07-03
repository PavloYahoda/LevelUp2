
public class ReverseOrder {
//STATIC
    private static final int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static void result2() {
        for (int i = 1; i <= 9; i++) {
            for (int j : number) {
                System.out.print(j + "x" + i + "=" + j * i + "  ");
            }
            System.out.println();
        }
    }
//NO-STATIC
    private final int[] number1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public void result4() {
        for (int i = 1; i <= 9; i++) {
            for (int j : number1) {
                System.out.print(j + "x" + i + "=" + j * i + "  ");
            }
            System.out.println();
        }
    }

}
