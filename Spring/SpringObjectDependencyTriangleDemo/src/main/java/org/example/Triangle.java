package org.example;

// Triangle having 3 points , it is dependent on point class .Total 3 * 2 = 6 coordinates
//(4,7) : p1
//(5,10) : p2
//(9,15) : p3

public class Triangle {
    //Aggregation
    private Point p1,p2,p3;

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point getP3() {
        return p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    @Override
    public String toString() {
        return "***********TRIANGLE COORDINATES***********\nTriangle{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                ", p3=" + p3 +
                '}';
    }
}
