
public class DirectOrder {
//STATIC

    public static void result1() {
        for (int i = 1; i <= 9; i++) {
            for (int j : HomeWork4.number) {
                System.out.print(i + "x" + j + "=" + j * i + "  ");
            }
            System.out.println();
        }
    }
//NO-STATIC

    public void result3() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i + "x" + j + "=" + i * j + "  ");
            }
            System.out.println();
        }
    }
}