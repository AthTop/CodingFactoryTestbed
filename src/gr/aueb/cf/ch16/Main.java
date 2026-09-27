package gr.aueb.cf.ch16;

public class Main {

    public static void main(String[] args) {
        Printable photo = new Photo(1L, "Athens");
        Printable doc = new Document(1L, "Secret document");

        Thread thread = new Thread(() -> {
            for (int i = 0; i <= 1000000000 ; i++) {
                if (i == 1000000000) {
                    photo.print();
                    doc.print();
                }
            }
        });

        thread.start();
        System.out.println("Waiting for photo and doc prints.");
    }
}
