package edu.ufp.inf.lp2._01_intro;

public class Point {

  public float x;

  public float y;

  public float dist(Point p) {

    float dx = this.distX(p);
    //float dy = this.distY(p);       PODEMOS ESCREVER ASSIM, FICA IGUAL À DE BAIXO
    float dy = p.distY(this);

    return (float)Math.sqrt(dx*dx+dy*dy);
  }


  public float distX(Point p) {
    return this.x- p.x;
  }


  public float distY(Point p) {

    return this.y-p.y;
  }

  //Generated

  public Point(float x, float y) {
    this.x = x;
    this.y = y;
  }

  public void moveX(float dx) {
    this.x+=dx;
  }

  public void moveY(float dy) {
    this.y+=dy;
  }

  public float getX() {
    return x;
  }

  public void setX(float x) {
    this.x = x;
  }

  public float getY() {
    return y;
  }

  public void setY(float y) {
    this.y = y;
  }
}