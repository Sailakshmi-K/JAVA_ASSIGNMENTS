package org.example;

//Triangle IS-A Shape
//Circle IS-A Shape
public class Shape {
    private Triangle t;
    private Circle c;
    private Rectangle r;

    public Triangle getT() {
        return t;
    }

    public void setT(Triangle t) {
        this.t = t;
    }

    public Circle getC() {
        return c;
    }

    public void setC(Circle c) {
        this.c = c;
    }

    public Rectangle getR() {
        return r;
    }

    public void setR(Rectangle r) {
        this.r = r;
    }

    public void display(){
        System.out.println( getT());
        System.out.println(getR());
        getC().display();
    }
}

