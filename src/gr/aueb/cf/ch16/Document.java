package gr.aueb.cf.ch16;

public class Document implements Printable {
    private long id;
    private String title;

    public Document() {}

    public Document(long id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Document: " + title);
    }
}
