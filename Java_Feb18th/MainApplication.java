package Java_Feb18th;

class Addition{
//add method overloading for add()
    public void add(int a,int b){
    System.out.println("sum of 2 args : "+(a+b));
    }
    public  void add(int a,int b,int c){
        System.out.println("sum of 3 args : "+(a+b+c));
    }
}

class Varargs_Addition {
    //use varargs for add method
    public void methodVarArgs(int... num) {
        int sum = 0;
        for (int n : num) {
            sum += n;
        }
        System.out.println("sum : " + sum);
    }
}

public class MainApplication {
    public static void main(String[] args) {

        Addition obj_add=new Addition();
        System.out.println("Method overloaded Addition ::::::::: ");
        obj_add.add(4,5);
        obj_add.add(4,5,6);

        Varargs_Addition obj_varadd=new Varargs_Addition();
        System.out.println("Var args Addition ::::::::::");
        System.out.println("2 args addition : ");
        obj_varadd.methodVarArgs(4,5);
        System.out.println("3 args addition : ");
        obj_varadd.methodVarArgs(4,5,6);
        System.out.println("4 args addition : ");
        obj_varadd.methodVarArgs(4,5,6,7);

    }

}
/*
Method overloaded Addition ::::::::: 
sum of 2 args : 9
sum of 3 args : 15
Var args Addition ::::::::::
2 args addition : 
sum : 9
3 args addition : 
sum : 15
4 args addition : 
sum : 22

Process finished with exit code 0
*/
