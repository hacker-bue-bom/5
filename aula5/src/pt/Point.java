package pt;

public class Point {
    //atributos da classe
    private double x;
    private double y;

    //construtores:
    public Point() {
        x= 0;
        y=0;
    }

    public Point(double x, double y) {
        this.x= x;
        this.y= y;
    }

    //getters:
    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    //setters:
    public void setX(double x) {
        this.x= x;
    }

    public void setY(double y) {
        this.y= y;
    }

    public void setXY(double x, double y) {
        this.x= x;
        this.y= y;
    }

    //methods:
    public double distanceTo(Point otherPoint) {
        double distance = Math.sqrt(
                Math.pow(otherPoint.getX() - x, 2) - Math.pow(otherPoint.getY() - y, 2)
        );
        return distance;
    }
    //////////////////////////////////////////////////

}