package printing;

public class Document implements Printable {
    private String filename;

    public Document(String filename) {
        this.filename = filename;
    }

    @Override
    public void print() {
        System.out.printf("Printing document: " + filename);
    }    // a
}
