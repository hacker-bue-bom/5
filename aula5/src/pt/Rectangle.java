package pt;

public class Rectangle {
    //atributos
    Point topLeftPoint;
    Double height;
    Double width;

    //constructors:
    public Rectangle() {
        this.topLeftPoint = new Point();
        this.height = 0.0;
        this.width = 0.0;
    }

    public Rectangle(Point a, Double b, Double c) {
        this.topLeftPoint= a;
        this.height= b;
        this.width= c;
    }

    public void checker(Point q) {
        double checkX = q.getX() - topLeftPoint.getX();
        double checkY = q.getY() - (topLeftPoint.getY() - height);
        if (0.0 <= checkX && checkX <= width && 0.0 <= checkY && checkY <= height) {
            System.out.println("esta contido");
        }
        else {
            System.out.println("nao esta contido");
        }
    }
}
