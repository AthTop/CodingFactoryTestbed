package gr.aueb.cf.ch12;

public class Main {

    public static void main(String[] args) {
        PointXYZ point = new PointXYZ(1.1, 2.2, 3.3);

        System.out.println("XY Distance: " + point.getXYDistance());
        System.out.println("YZ Distance: " + point.getYZDistance());
        System.out.println("XZ Distance: " + point.getXZDistance());
        System.out.println("XYZ Distance: " + point.getXYZDistance());

    }
}
