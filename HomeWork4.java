
public class HomeWork4 {

    public static final int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static void main(String[] args) {
//STATIC
        System.out.println("Direct order:");
        DirectOrder.result1();

        System.out.println("\nReverse order:");
        ReverseOrder.result2();
//NO-STATIC
        System.out.println("\nDirect order:");
        DirectOrder direct = new DirectOrder();
        direct.result3();

        System.out.println("\nReverse order:");
        ReverseOrder reverse = new ReverseOrder();
        reverse.result4();
    }
}



