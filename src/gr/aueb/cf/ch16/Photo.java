package gr.aueb.cf.ch16;

public class Photo implements Printable {
    private long id;
    private String location;

    public Photo() {}

    public Photo(long id, String location) {
        this.id = id;
        this.location = location;
    }

    @Override
    public void print() {
        System.out.println("Photo taken at: " + location);
    }
}
