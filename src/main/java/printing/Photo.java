package printing;

public class Photo implements Printable{
    private String desctiption;

    public Photo(String photo) {
        this.desctiption = photo;
    }


    @Override
    public void print() {
        System.out.printf("Photo printed in color: " + desctiption);

    }
}
