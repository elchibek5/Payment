package printing;

public class PrintQueque {

    public static void printInReverseOrder(Printable[] items) {
        System.out.println("Starting the process to print in reverse order");

        for (int i = items.length - 1; i >= 0; i--) {
            items[i].print();
        }
        System.out.println("Print queque is completed!");
    }
}
