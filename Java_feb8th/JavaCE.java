package Exceptions;
import java.util.Scanner;
public class JavaCE {
    public static void main(String[] args) {
        User obj_u=new User();
        Scanner cin=new Scanner(System.in);
        int c=1;
        while(c<=3) {
            System.out.println("Enter amount : ");
            float amount = cin.nextFloat();
            System.out.println("Enter withdraw amount:");
            float withdraw = cin.nextFloat();
            try {
                obj_u.validAmount(amount, withdraw);
            } catch (InvalidAmountException e) {
                System.out.println("Please enter amount greater than zero .");
            } catch (InsufficientBalanceException e) {
                System.out.println("Please enter withdraw amount within ur balance range");
            } catch (Exception e) {
                System.out.println("Make sure of both amount and balance user .");
            }
            c++;
        }
    }
}
