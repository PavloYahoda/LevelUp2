
public class ReverseOrder {
//STATIC

    public static void result2() {
        for (int i = 1; i <= 9; i++) {
            for (int j : HomeWork4.number) {
                System.out.print(j + "x" + i + "=" + j * i + "  ");
            }
            System.out.println();
        }
    }
//NO-STATIC

    public void result4() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(j + "x" + i + "=" + j * i + "  ");
            }
            System.out.println();
        }
    }

}
