package JavaFeb22;

interface Shape{
    void show();
    default void draw(){
        sides();
        System.out.println("Draw method");
    }
    static void color(){
        shape();
        System.out.println("Color method");
    }
    private void sides(){
        System.out.println("private non-static method");
    }
    private static void shape(){
        System.out.println("Private static method");
    }
}

public class Interface_Private implements Shape{

    @Override
    public void show() {
        System.out.println("Show method");
    }

    public static void main(String[] args) {
        Shape s= (Shape) new Interface_Private();
        s.draw();
        s.show();
        Shape.color();

    }
}
