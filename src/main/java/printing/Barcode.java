package printing;

public class Barcode implements Printable{
    private String code;

    public Barcode(String code) {
        this.code = code;
    }

    @Override
    public void print() {
        System.out.printf("Barcode " + code + " sent to label printer");
    }
}
