package pt;

public class Main {
    public static void main(String[] args) {
        Point a = new Point(3.0,3.0);
        Point b = new Point(3.4,3.0);
        Point c = new Point(2.0,5.0);

        System.out.println(a.getX());
        a.setX(5.0);
        System.out.println(a.getX());
        System.out.println(a.distanceTo(b));

        Triangle triangle = new Triangle(a,b,c);
        System.out.println(triangle.calcArea());

        Rectangle rec = new Rectangle(new Point ( 1.0, 7.0), 6.0, 9.0);
        rec.checker(new Point (2.5,6.1) );
    }


}
