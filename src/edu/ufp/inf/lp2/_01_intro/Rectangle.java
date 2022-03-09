package edu.ufp.inf.lp2._01_intro;

public class Rectangle {

    private Point ulc;
    private Point lrc;

    public Rectangle(Point ulc, Point lrc) {
        this.ulc = ulc;
        this.lrc = lrc;
    }


    public void movelrc(float dx, float dy) {
        this.lrc.x+=dx;
        this.lrc.y+=dy;
    }

    public void moveulc(float dx, float dy) {
        this.ulc.x+=dx;
        this.ulc.y+=dy;
    }


    public float area() {
        float area = ulc.distX(lrc)*ulc.distY(lrc);
        if(area<0)area*=(-1);return area;
    }

    public float perimeter() {
        return (ulc.distX(lrc)+ulc.distY(lrc)*-1)*2;
    }

    public boolean isInside(Point p) {

        return p.x>=ulc.x && p.x<=lrc.x && p.y<=ulc.y && p.y>=lrc.y;
    }

    public boolean isOutside(Point p) {

        return p.x<ulc.x || p.x>lrc.x || p.y>ulc.y || p.y<lrc.y;
    }

    public String toString() {

        return "Rectangle@{(" + ulc.x + "," + ulc.y + ");(" + lrc.x + "," + lrc.y + ")}";
    }

    public static void main(String[] args) {

        Point ulc = new Point(0,2);
        Point lrc = new Point(2,0);

        Rectangle rectangle = new Rectangle(ulc, lrc);

        Point point1 = new Point(1,1);



    }

}