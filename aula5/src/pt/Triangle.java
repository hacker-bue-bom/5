package pt;

public class Triangle {
    //atributos
    Point a;
    Point b;
    Point c;

    //construtor
    public Triangle() {
        this.a= new Point();
        this.b= new Point();
        this.c= new Point();
    }

    public Triangle(Point a, Point b, Point c) {
        this.a= a;
        this.b= b;
        this.c= c;
    }

    //getters
    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }
    public Point getC() {
        return c;
    }

    //setters
    public void setA(Point a) {
        this.a = a;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public void setTriangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //methods
    public double calcBase() {
        return b.distanceTo(c);
    }

    public double calcHeight() {
        return b.distanceTo(a);
    }

    public double calcArea(){
        return (calcBase() * calcHeight())/2;
    }


}